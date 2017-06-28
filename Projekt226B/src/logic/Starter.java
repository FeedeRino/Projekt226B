package logic;

import dto.Game;


/**
 * 
 * @author Noah Hermann
 * Diese Klasse sollte mit Hilfe von Polymorphie die einzelnen Spiele starten, macht aber momentan nichts
 */
public class Starter {

	private Game game;

	public Starter(Game game) {

	}

	protected void startGame() {

	}

	public Game getGame() {
		return game;
	}

}
