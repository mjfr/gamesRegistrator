package br.senai.sp.informatica.gamesRegistrator.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/gamesRegistrator", "root", "root132");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
	}
	
}