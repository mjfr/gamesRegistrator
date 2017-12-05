package br.senai.sp.informatica.gamesRegistrator.model;

public class Game {

	private String gameTitle;
	private String developer;
	private String gameCategory;
	private int releaseYearString;
	public Game(String gameTitle, String developer, String gameCategory, int releaseYearString) {
		super();
		this.gameTitle = gameTitle;
		this.developer = developer;
		this.gameCategory = gameCategory;
		this.releaseYearString = releaseYearString;
	}
	
	public Game() {
		// TODO Auto-generated constructor stub
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getGameCategory() {
		return gameCategory;
	}

	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}

	public int getReleaseYearString() {
		return releaseYearString;
	}

	public void setReleaseYearString(int releaseYearString) {
		this.releaseYearString = releaseYearString;
	}
	
	
	
}
