package Model.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	
	public ArrayList<Funcionario> consulta() {
    	Conexao conexao = new Conexao();
    	PreparedStatement stmt;
    	ArrayList<Funcionario> funcionarios;
    	
		try {
			stmt = conexao.getConn().prepareStatement("select * from Funcionario");
		
	    	ResultSet rs = stmt.executeQuery();
	    	funcionarios = new ArrayList<Funcionario>();
	    	while (rs.next()) {
				// criando o objeto Contato
				Funcionario funcionario = new Funcionario();
				funcionario.setNomeFun(rs.getString("nomeFun"));
				funcionario.setCpf(rs.getString("cpf"));
				funcionario.setTelefone(rs.getString("telefone"));
				funcionario.setEmail(rs.getString("email"));
				funcionario.setCargo(rs.getString("cargo"));
				funcionario.setPermissao(Integer.parseInt(rs.getString("permissao")));
				
				// adicionando o objeto lista
				funcionarios.add(funcionario);
	    	}
	    	
	    	rs.close();
	    	stmt.close();
	    	return funcionarios;
	    	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public Funcionario consultaIdFunc() {
    	Conexao conexao = new Conexao();
    	PreparedStatement stmt;
    	Funcionario funcionario = new Funcionario();
    	
		try {
			stmt = conexao.getConn().prepareStatement("SELECT func.idFuncionario FROM funcionario func ORDER BY func.idFuncionario DESC LIMIT 1;");
		
	    	ResultSet rs = stmt.executeQuery();
	    	rs.next();
	    	funcionario.setId(rs.getInt("idFuncionario"));
	    	
	    	rs.close();
	    	stmt.close();
	    	return funcionario;
	    	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
