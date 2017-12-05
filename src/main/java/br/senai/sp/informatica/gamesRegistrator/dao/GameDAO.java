package br.senai.sp.informatica.gamesRegistrator.dao;

import java.sql.Connection;

import br.senai.sp.informatica.gamesRegistrator.config.ConnectionFactory;

public class GameDAO {

	private Connection connection;
	
	public GameDAO() {
		connection = new ConnectionFactory().getConnection();
	}
}
