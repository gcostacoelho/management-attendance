package Model.Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Entity.Funcionario;
import Model.Entity.Usuario;

public class UsuarioDao {
	public void salvar(Usuario usuario) {
		Conexao conexao = new Conexao();
        String sql = "INSERT INTO " +
                "Usuario (usuario, senha, Funcionario_idFuncionario)" + "VALUES (?,?,?)";
        
        try {
        	PreparedStatement stmt = conexao.getConn().prepareStatement(sql);
			stmt.setString(1, usuario.getUsuario());
			stmt.setString(2, usuario.getSenha());
			stmt.setInt(3, usuario.getIdFunc());
        	
        	stmt.execute();
            stmt.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        } 
	}

}
