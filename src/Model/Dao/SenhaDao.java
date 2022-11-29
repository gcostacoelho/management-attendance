package Model.Dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.Entity.Senha;
import Model.Entity.Ticket;

public class SenhaDao {
	
	public void addSenha(int idPrioridade) {
		Conexao conexao = new Conexao();
        String sql = "INSERT INTO " 
		+ "Senha (numeroSen, dataSen, horaSen, Prioridade_idPrioridade)" 
        + "VALUES (somaSenha(), curdate(), current_time(), ?)";
        
        try {
        	PreparedStatement stmt = conexao.getConn().prepareStatement(sql);
			stmt.setInt(1, idPrioridade);
        	
        	stmt.execute();
            stmt.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        } 
	}
	
	public Ticket consultaUltimaSenha() {
		Conexao conexao = new Conexao();
		PreparedStatement stmt;
        String sql = "select sn.numeroSen, sn.dataSen, sn.horaSen, pr.nomePri, sr.sigla, sr.nomeSer from Senha sn \r\n"
        		+ "inner join Prioridade pr on sn.Prioridade_idPrioridade = pr.idPrioridade\r\n"
        		+ "inner join Servico sr on pr.Servico_idServico = sr.idServico\r\n"
        		+ "order by sn.numeroSen desc limit 1;";
        
        try {
        	stmt = conexao.getConn().prepareStatement(sql);
    		
	    	ResultSet rs = stmt.executeQuery();
	    	rs.next();
	    	Ticket ticket = new Ticket();
	    	ticket.setSenha(rs.getInt("numeroSen"));
	    	ticket.setSiglaServico(rs.getString("sigla"));
	    	ticket.setNomeSer(rs.getString("nomeSer"));
	    	ticket.setDataSenha(rs.getDate("dataSen"));
	    	ticket.setHoraSenha(rs.getTime("horaSen"));
	    	ticket.setPrioridade(rs.getString("nomePri"));
        	
        	stmt.execute();
            stmt.close();
            return ticket;
        
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
		 
	}
}
