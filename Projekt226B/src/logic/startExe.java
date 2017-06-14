package logic;


import dto.Game;

public class startExe extends Starter {

	protected startExe(Game game) throws Exception {
		super(game);
		
		String path = game.getPfad();
		ProcessBuilder p = new ProcessBuilder();
		p.command(path);
		p.start();
		
	}

}
