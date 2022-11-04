package Model.Dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import Model.Entity.Funcionario;

public class FuncionarioDao {
	
	public void salvar(Funcionario funcionario) {
		Conexao conexao = new Conexao();
        String sql = "INSERT INTO " +
                "funcionario (nomeFun, cpf, telefone, email, cargo, permissao)" + "VALUES (?,?,?,?,?,?)";
        
        try {
        	PreparedStatement stmt = conexao.getConn().prepareStatement(sql);
			stmt.setString(1, funcionario.getNomeFun());
			stmt.setString(2, funcionario.getCpf());
			stmt.setString(3, funcionario.getTelefone());
			stmt.setString(4, funcionario.getEmail());
			stmt.setString(5, funcionario.getCargo());
			stmt.setInt(6, funcionario.getPermissao());
        	
        	stmt.execute();
            stmt.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        } 
	}
}
