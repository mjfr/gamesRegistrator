package br.senai.sp.informatica.gamesRegistrator.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.informatica.gamesRegistrator.model.Game;

@WebServlet("/addGame")
public class AddGameServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String gameTitle = req.getParameter("gameTitle");
		String developer = req.getParameter("developer");
		String gameCategory = req.getParameter("gameCategory");
		String releaseYearString = req.getParameter("releaseYear");
		int releaseYear = Integer.parseInt(releaseYearString);
		
		Game game = new Game();
		game.setGameTitle(gameTitle);
		game.setDeveloper(developer);
		game.setGameCategory(gameCategory);
		game.setReleaseYearString(releaseYear);
		
		
		
	}
}