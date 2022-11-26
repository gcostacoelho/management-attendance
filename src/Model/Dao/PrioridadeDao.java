package Model.Dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import Model.Entity.Prioridade;

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
}
