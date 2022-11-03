package Model.Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Entity.Guiche;

public class GuicheDao {

	public void salvar(Guiche guiche) {
		Conexao conexao = new Conexao();
        String sql = "INSERT INTO " +
                "guiche (numeroGui, descricaoGui)" + "VALUES (?, ?)";
        
        try {
        	PreparedStatement stmt = conexao.getConn().prepareStatement(sql);
			stmt.setInt(1, guiche.getNumeroGui());
			stmt.setString(2, guiche.getDescricaoGui());
        	
        	stmt.execute();
            stmt.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        } 
	}
}
