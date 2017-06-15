package logic;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import dto.Game;

public class startBrowser extends Starter {

	protected startBrowser(Game game) {
		super(game);
	
		 String url = game.getPfad();

	        if(Desktop.isDesktopSupported()){
	            Desktop desktop = Desktop.getDesktop();
	            try {
	                desktop.browse(new URI(url));
	            } catch (IOException | URISyntaxException e) {
	                e.printStackTrace();
	            }
	        }else{
	            Runtime runtime = Runtime.getRuntime();
	            try {
	                runtime.exec("Open " + url);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	}

}
