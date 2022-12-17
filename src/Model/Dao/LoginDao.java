package Model.Dao;


import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Entity.Login;

public class LoginDao {
	
	public ArrayList<Login> consulta(Login login){
		Conexao conexao = new Conexao();
		PreparedStatement stmt;
		ArrayList<Login> respLogin;
		String sql = "select us.usuario, us.senha, fun.permissao from Usuario us "
				+ "inner join Funcionario fun on us.Funcionario_idFuncionario = fun.idFuncionario "
				+ "where us.usuario = ? and us.senha = ?;";
		
		try {
			stmt = conexao.getConn().prepareStatement(sql);
			
			stmt.setString(1, login.getUsuario());
			stmt.setString(2, login.getSenha());
			
			ResultSet rs = stmt.executeQuery();
			respLogin = new ArrayList<Login>();
			while(rs.next()) {
				Login loginResp = new Login();
				loginResp.setUsuario(rs.getString("usuario"));
				loginResp.setSenha(rs.getString("senha"));
				loginResp.setPermissao(rs.getInt("permissao"));
				
				respLogin.add(loginResp);
			}
			
			
			stmt.close();
			rs.close();
			return respLogin;
			
		} catch (SQLException e){
			e.printStackTrace();
			return null;
		}
	}
}
