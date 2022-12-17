package Model.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Entity.Guiche;
import Model.Entity.Servico;

public class GuicheDao {

	public void salvar(Guiche guiche) {
		Conexao conexao = new Conexao();
        String sql = "INSERT INTO " +
                "Guiche (numeroGui, descricaoGui)" + "VALUES (?, ?)";
        
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
	
	public ArrayList<Guiche>consultarDesc(){
		Conexao conexao = new Conexao();
		PreparedStatement stmt;
		ArrayList<Guiche> guiches;
		
		try {
			stmt = conexao.getConn().prepareStatement("select descricaoGui from Guiche");

			ResultSet rs = stmt.executeQuery();

			guiches = new ArrayList<Guiche>();
			
			while(rs.next()) {
				Guiche guiche = new Guiche();

				guiche.setDescricaoGui(rs.getString("descricaoGui"));	
				
				guiches.add(guiche);
			}
			
			rs.close();
			stmt.close();
			return guiches;
			
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
