package Model.Dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	
	public Senha consultaUltimaSenha() {
		Conexao conexao = new Conexao();
		PreparedStatement stmt;
        String sql = "select sn.numeroSen, sn.dataSen, sn.horaSen, pr.nomePri, sr.sigla from senha sn \r\n"
        		+ "inner join prioridade pr on sn.Prioridade_idPrioridade = pr.idPrioridade\r\n"
        		+ "inner join servico sr on pr.Servico_idServico = sr.idServico;";
        
        try {
        	stmt = conexao.getConn().prepareStatement(sql);
    		
	    	ResultSet rs = stmt.executeQuery();
	    	rs.next();
	    	
        	
        	stmt.execute();
            stmt.close();
            retrun senha;
        
        } catch (SQLException e) {
            e.printStackTrace();
        } 
	}
}
