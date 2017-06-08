package logic;

import dto.Game;

public class startExe extends Starter {

	protected startExe(Game game) throws Exception {
		super(game);
		
		Process process = new ProcessBuilder(game.getPfad()).start();
	}

}
