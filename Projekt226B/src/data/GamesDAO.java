package data;

import java.util.ArrayList;

import dto.Game;


// Dies ist ein Interface, welches die Daten und Logik Schichten verbindet
//Es wird die Liste aller Spiele uebergeben

public interface GamesDAO {

	ArrayList<Game> list();

}
