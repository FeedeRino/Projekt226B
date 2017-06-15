package logic;

import java.util.ArrayList;

import data.GamesDAO;
import data.GamesData;
import dto.Game;

public class startGames {

	private GamesDAO dataGames = new GamesData();

	public void startGame(Game starterGame) throws Exception {

		if (starterGame.getStartauswahl() == true) {
			startBrowser sb = new startBrowser(starterGame);
		} else if (starterGame.getStartauswahl() == false) {
			startExe se = new startExe(starterGame);
		}

	}

	public String getBeschreibung(Game starterGame) {

		String titel = starterGame.getTitel();
		String genre = starterGame.getGenre();
		String publisher = starterGame.getPublisher();
		String altersfreigabe = Integer.toString(starterGame.getAltersfreigabe());
		String beschreibung = starterGame.getBeschreibung();

		String info = titel + "," + genre + "," + publisher + "," + altersfreigabe + "," + beschreibung;

		return info;
	}

	public ArrayList<Game> getAllGames() {
		ArrayList<Game> AllGames = dataGames.list();

		return AllGames;

	}
}
