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

	public ArrayList<Game> getAllGames() {
		ArrayList<Game> AllGames = dataGames.list();
		return AllGames;
	}
}
