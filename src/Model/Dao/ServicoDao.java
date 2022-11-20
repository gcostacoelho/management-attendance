package Model.Dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
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
}
