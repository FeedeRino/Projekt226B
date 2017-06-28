package logic;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import dto.Game;

/**
 * 
 * @author Noah Hermann
 * In dieser Klasse werden die Browser Spiele gestartet
 */
public class startBrowser extends Starter {

	/**
	 * Hier wird anhand des definierten Pfades (URL) das Spiel aufgerufen
	 * @param game Das jeweilige Spiel Objekt, welches später auch ausgeführt wird
	 */
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
