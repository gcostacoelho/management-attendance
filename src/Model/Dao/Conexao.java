package Model.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	Connection conn = null;
	
	
	public Conexao() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://172.17.0.2:3306/ma", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public Connection getConn() {
		return conn;
	}
	
	public void setConn(Connection conn) {
		this.conn = conn;
	}
}
