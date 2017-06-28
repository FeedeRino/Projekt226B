package data;

import java.util.ArrayList;

import dto.Game;

/**
 * Dies ist ein Interface, welches die Daten und Logik Schichten verbindet Es
 * wird die Liste aller Spiele uebergeben
 * 
 * @author Jannick Mueller
 *
 */

public interface GamesDAO {
	/**
	 * Hier wird festgelegt das diese Methode erstellt werden muss.
	 * 
	 * @return
	 */
	ArrayList<Game> list();

}
