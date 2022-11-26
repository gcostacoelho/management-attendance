package Model.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.Entity.Servico;

public class ServicoDao {
	
	public void salvar(Servico servico) {
		Conexao conexao = new Conexao();
        String sql = "INSERT INTO " 
		+ "Servico (sigla, nomeSer, descricaoSer, statusSer)" 
        + "VALUES (?, ?, ?, ?)";
        
        try {
        	PreparedStatement stmt = conexao.getConn().prepareStatement(sql);
        	stmt.setString(1, servico.getSigla());
        	stmt.setString(2, servico.getNome());
        	stmt.setString(3, servico.getDesc());
			stmt.setBoolean(4, servico.isStatus());
        	
        	stmt.execute();
            stmt.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        } 
	}
	
	public ArrayList<Servico>consulta_id(){
		Conexao conexao = new Conexao();
		int idServico;
		PreparedStatement stmt;
		ArrayList<Servico> servicos;
		
		try {
			stmt = conexao.getConn().prepareStatement("select idServico, nomeSer from Servico");

			ResultSet rs = stmt.executeQuery();

			servicos = new ArrayList<Servico>();
			
			while(rs.next()) {
				Servico servico = new Servico();
				
				servico.setIdServico(rs.getInt("idServico"));
				servico.setNome(rs.getString("nomeSer"));
				
				
				servicos.add(servico);
			}
			
			rs.close();
			stmt.close();
			return servicos;
			
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Servico> consulta(){
		Conexao conexao = new Conexao();
		int statusInt;
		boolean statusBoo;
		PreparedStatement stmt;
		ArrayList<Servico> servicos;
		
		try {
			stmt = conexao.getConn().prepareStatement("select * from Servico");

			ResultSet rs = stmt.executeQuery();

			servicos = new ArrayList<Servico>();

			while (rs.next()) {
				Servico servico = new Servico();

				servico.setNome(rs.getString("nomeSer"));
				servico.setSigla(rs.getString("sigla"));
				servico.setDesc(rs.getString("descricaoSer"));

				// Define boolean por conta do banco
				statusInt = rs.getInt("statusSer");

				if (statusInt == 0){
					statusBoo = false;
				}else{
					statusBoo = true;
				}

				servico.setStatus(statusBoo);

				servicos.add(servico);
			}

			rs.close();
			stmt.close();
			return servicos;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
