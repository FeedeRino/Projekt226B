package logic;


import dto.Game;

/**
 * 
 * @author Noah Hermann
 * In dieser Klasse werden die Spiele, welche lokal gespeichert sind gestartet
 */

public class startExe extends Starter {

	/** 
	 * 
	 * @param game das Game Objekt, das mit Hilfe des Pfades in Windows gestartet wird
	 * In dieser Methode wird ein Spiel uebergeben, anhand dessen Pfad dann das Spiel ausgefuehrt wird
	 */
	
	protected startExe(Game game) throws Exception {
		super(game);
		
		ProcessBuilder p = new ProcessBuilder();
		p.command(game.getPfad());
		p.start();
		
	}

}
