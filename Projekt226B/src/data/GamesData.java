package data;

import java.util.ArrayList;

import dto.Game;

/**
 * Diese Klasse enthält die Daten der einzelnen Game Objekte
 * 
 * @author Jannick Mueller
 *
 */

public class GamesData implements GamesDAO {
	ArrayList<Game> gameData = new ArrayList<Game>();

	/**
	 * Im Konstruktor werden die einzelnen Spiele und ihre Daten erstellt und in
	 * eine ArrayList gespeichert
	 */

	public GamesData() {
		Game g1 = new Game("Agar.io", "Genre: Multiplayer-Spiel", "Publisher: Miniclip", 3,
				"Agar.io ist ein kostenloses Multiplayer-Spiel. Es wurde von dem Reddit-Nutzer Zeach entwickelt. Der Name des Spiels wurde dem Galactose-Polymer Agar entlehnt. Bei Agar.io muss der Spieler eine Zelle steuern, die dadurch wächst, dass sie andere Zellen frisst. Sie darf dabei jedoch nicht selbst von größeren Zellen gefressen werden, da sonst das laufende Spiel verloren wird.",
				"http://agar.io/", true);
		this.gameData.add(g1);

		Game g2 = new Game("Forge of Empires", "Genre: Strategiespiel", "Publisher: InnoGames", 3,
				"Ziel des Echtzeit-Strategiespiels ist es, sein Dorf durch verschiedene Zeitalter (zur Zeit von der Steinzeit über die Bronzezeit bis hin zur Zukunft) zu führen. Dazu steht ein begrenzter Bauplatz zur Verfügung, der nach und nach erweitert werden kann. An Ressourcen hat man zu Anfang eine gewisse Anzahl an Münzen und Vorräten. Münzen werden über Wohngebäude eingenommen, Vorräte in Produktionsstätten hergestellt. Neben der Baufläche, auf der der Spieler seine Stadt bestehend aus Häusern, kulturellen Gebäuden, Kasernen, Produktionsstätten und Gütergebäuden errichtet, enthält das Spiel eine Zeitleiste, auf der die einzelnen Zeitalter markiert sind, eine Kampffläche, auf der sich die jeweiligen Armeen bekämpfen, und eine Karte der Kontinente, deren Provinzen von dem Spieler erobert werden müssen.",
				"https://de.forgeofempires.com/", true);
		this.gameData.add(g2);

		Game g3 = new Game("Minesweeper", "Genre: Familienunterhaltung", "Publisher: Microsoft Corporation", 3,
				"Minesweeper (englisch mine sweeper: „Minenräumer“) ist ein simples, dem Betriebssystem Microsoft Windows bis einschließlich der Version Windows 7 beigelegtes Computerspiel, bei dem der Spieler durch eine Kombination aus logischem Denken und (bisweilen) zufälligem Raten herausfinden soll, unter welchen Feldern „Minen“ versteckt sind. Das Ziel ist, alle Felder aufzudecken, hinter welchen keine Minen verborgen sind. Als zusätzliche Herausforderung läuft eine Stoppuhr, sodass das Spiel zumeist auf Zeit gespielt wird, wobei die tieferen logischen Herausforderungen des Spiels kaum wahrgenommen werden.",
				"C:\\Program Files\\Microsoft Games\\Minesweeper\\minesweeper.exe", false);
		this.gameData.add(g3);

		Game g4 = new Game("Mahjong Titans", "Genre: Familienunterhaltung", "Publisher: Microsoft Corporation", 3,
				"Microsoft Mahjong (früher Mahjong Titans und Taipei) ist eine Computerspielversion von Mahjong Solitaire von Microsoft veröffentlicht. Die Version mit dem Titel Mahjong Titans wurde von Oberon Games entwickelt und in Windows Vista und Windows 7 (außer Starter und Home Basic Edition) enthalten. Es nutzt die neue grafische Benutzeroberfläche (GUI) von Windows Vista und enthält Funktionen wie Kachel-Set und Hintergrund-Auswahl. (In Windows Vista baut 5219, 5231 und 5259, das Spiel wurde als Shanghai Solitaire bekannt.) Das Spiel hat es nicht zu Windows 8 gemacht; Jedoch kann eine eigenständige Version, die von Arkadium entwickelt und von Microsoft Studios veröffentlicht wurde, kostenlos aus dem Windows Store heruntergeladen werden.",
				"C:\\Program Files\\Microsoft Games\\Mahjong\\mahjong.exe", false);
		this.gameData.add(g4);
	}

	/**
	 * Mit dieser Methode wird die ArrayList der Spiele zurueckgegeben
	 */

	@Override
	public ArrayList<Game> list() {

		return this.gameData;
	}
}
