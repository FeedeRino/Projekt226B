package logic;

import java.util.ArrayList;

import data.GamesDAO;
import data.GamesData;
import dto.Game;

/**
 * 
 * @author Noah Hermann
 * In dieser Klasse wird entschieden welche Art von Spiel gestartet werden muss
 */

public class startGames {

	private GamesDAO dataGames = new GamesData();

	/** 
	 * 
	 * @param starterGame Game Objekt welches zur identifikation der Art des Spiels verwendet wird
	 * Diese Methode bestimmt anhand von einem definierten Wert, um was fuer ein Spiel es sich handelt
	 */
	
	public void startGame(Game starterGame) throws Exception {

		if (starterGame.getStartauswahl() == true) {
			startBrowser sb = new startBrowser(starterGame);
		} else if (starterGame.getStartauswahl() == false) {
			startExe se = new startExe(starterGame);
		}

	}

	public String getTitel(Game starterGame) {

		String titel = starterGame.getTitel();

		return titel;
	}

	public String getInfo(Game starterGame) {

		String genre = starterGame.getGenre();
		String publisher = starterGame.getPublisher();
		String altersfreigabe = Integer.toString(starterGame.getAltersfreigabe());
		String beschreibung = starterGame.getBeschreibung();

		String info = genre + "\n" + publisher + "\nPEGI: " + altersfreigabe + "\nBeschreibung: " + beschreibung;

		return info;
	}

	public ArrayList<Game> getAllGames() {
		ArrayList<Game> AllGames = dataGames.list();

		return AllGames;

	}
}
