package Model.Dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import Model.Entity.Atendimento;

public class AtendimentoDao {
	
	public void salvar(Atendimento atendimento) {
		Conexao conexao = new Conexao();
		/*
        String sql = "INSERT INTO " +
                "atendimento (statusAte, dataAte, horaAte, nota, Senha_idSenha, Funcionario_idFuncionario)"
        		+ "VALUES (?,?,?,?,?,?)";
        */
        String sql = "INSERT INTO " 
        + "Atendimento (statusAte, dataAte, horaAte, nota)"
        + "VALUES (?,?,?,?)";
        try {
        	PreparedStatement stmt = conexao.getConn().prepareStatement(sql);
			stmt.setString(1, atendimento.getStatusAte());
			stmt.setDate(2, atendimento.getDataAte());
			stmt.setTime(3, atendimento.getHoraAte());
			stmt.setString(4, atendimento.getNota());
			//stmt.setInt(5, );
			//stmt.setInt(6, );
        	
        	stmt.execute();
            stmt.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        } 
	}
}
