package logic;


import dto.Game;

public class startExe extends Starter {

	protected startExe(Game game) throws Exception {
		super(game);
		
		ProcessBuilder p = new ProcessBuilder();
		p.command(game.getPfad());
		p.start();
		
	}

}
