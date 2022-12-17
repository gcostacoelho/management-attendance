package Model.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.Entity.Prioridade;
import Model.Entity.Servico;

public class PrioridadeDao {

	public void salvar(Prioridade prioridade) {
		Conexao conexao = new Conexao();
        String sql = "INSERT INTO " 
		+ "Prioridade (nomePri, descricaoPri, peso, statusPri, Servico_idServico)" 
        + "VALUES (?, ?, ?, ?, ?)";
        
        try {
        	PreparedStatement stmt = conexao.getConn().prepareStatement(sql);
        	stmt.setString(1, prioridade.getNomePri());
        	stmt.setString(2, prioridade.getDescricaoPri());
			stmt.setInt(3, prioridade.getPeso());
			stmt.setBoolean(4, prioridade.isStatusPri());
			stmt.setInt(5, prioridade.getIdServico());
        	
        	stmt.execute();
            stmt.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        } 
	}
	
	public ArrayList<Prioridade> consulta(){
		Conexao conexao = new Conexao();
		int statusInt;
		boolean statusBoo;
		PreparedStatement stmt;
		ArrayList<Prioridade> prioridades;
		
		try {
			stmt = conexao.getConn().prepareStatement("select * from Prioridade");

			ResultSet rs = stmt.executeQuery();

			prioridades = new ArrayList<Prioridade>();

			while (rs.next()) {
				Prioridade prioridade = new Prioridade();

				prioridade.setNomePri(rs.getString("nomePri"));
				prioridade.setDescricaoPri(rs.getString("descricaoPri"));
				prioridade.setPeso(rs.getInt("peso"));
				prioridade.setIdServico(rs.getInt("Servico_idServico"));
				
				// Define boolean por conta do banco
				statusInt = rs.getInt("statusPri");

				if (statusInt == 0){
					statusBoo = false;
				}else{
					statusBoo = true;
				}

				prioridade.setStatusPri(statusBoo);
				prioridades.add(prioridade);
			}

			rs.close();
			stmt.close();
			return prioridades;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
