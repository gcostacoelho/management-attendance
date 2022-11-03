package Model.Dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import Model.Entity.Prioridade;

public class PrioridadeDao {

	public void salvar(Prioridade prioridade) {
		Conexao conexao = new Conexao();
        String sql = "INSERT INTO " 
		+ "prioridade (nomePri, descricaoPri, peso, statusPri)" 
        + "VALUES (?, ?, ?, ?)";
        
        try {
        	PreparedStatement stmt = conexao.getConn().prepareStatement(sql);
        	stmt.setString(1, prioridade.getNomePri());
        	stmt.setString(2, prioridade.getDescricaoPri());
			stmt.setInt(3, prioridade.getPeso());
			stmt.setBoolean(4, prioridade.isStatusPri());
        	
        	stmt.execute();
            stmt.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        } 
	}
}
