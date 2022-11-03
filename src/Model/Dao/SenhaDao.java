package Model.Dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import Model.Entity.Senha;

public class SenhaDao {
	
	public void salvar(Senha senha) {
		Conexao conexao = new Conexao();
        String sql = "INSERT INTO " 
		+ "senha (numeroSen, dataSen, horaSen)" 
        + "VALUES (?, ?)";
        
        try {
        	PreparedStatement stmt = conexao.getConn().prepareStatement(sql);
        	stmt.setInt(1, senha.getNumeroSen());
        	stmt.setDate(2, senha.getDateSen());
			stmt.setTime(3, senha.getHoraSen());
        	
        	stmt.execute();
            stmt.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        } 
	}
}
