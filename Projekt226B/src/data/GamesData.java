package data;

import java.util.ArrayList;

import dto.Game;

public class GamesData implements GamesDAO {
	ArrayList<Game> gameData = new ArrayList<Game>();

	@Override
	public ArrayList<Game> list() {
		Game g1 = new Game("Agar.io", "Genre: Multiplayer-Spiel", "Publisher: Miniclip", 3,
				"Agar.io ist ein kostenloses Multiplayer-Spiel. Es wurde von dem Reddit-Nutzer Zeach entwickelt. Der Name des Spiels wurde dem Galactose-Polymer Agar entlehnt. ,Bei Agar.io muss der Spieler eine Zelle steuern, die dadurch w�chst, dass sie andere Zellen frisst. Sie darf dabei jedoch nicht selbst von gr��eren Zellen gefressen werden, da sonst das laufende Spiel verloren wird.",
				"http://agar.io/", true);
		gameData.add(g1);

		Game g2 = new Game("Forge fo Empires", "Genre: Strategiespiel", "Publisher: InnoGames", 3,
				"Ziel des Echtzeit-Strategiespiels ist es, sein Dorf durch verschiedene Zeitalter (zur Zeit von der Steinzeit �ber die Bronzezeit bis hin zur Zukunft) zu f�hren.[5] Dazu steht ein begrenzter Bauplatz zur Verf�gung, der nach und nach erweitert werden kann. An Ressourcen hat man zu Anfang eine gewisse Anzahl an M�nzen und Vorr�ten. M�nzen werden �ber Wohngeb�ude eingenommen, Vorr�te in Produktionsst�tten hergestellt. Neben der Baufl�che, auf der der Spieler seine Stadt bestehend aus H�usern, kulturellen Geb�uden, Kasernen, Produktionsst�tten und G�tergeb�uden errichtet, enth�lt das Spiel eine Zeitleiste, auf der die einzelnen Zeitalter markiert sind, eine Kampffl�che, auf der sich die jeweiligen Armeen bek�mpfen, und eine Karte der Kontinente, deren Provinzen von dem Spieler erobert werden m�ssen.",
				"https://de.forgeofempires.com/", true);
		gameData.add(g2);

		Game g3 = new Game("Minesweeper", "Genre: Familienunterhaltung", "Publisher: Microsoft Corporation", 3,
				"Minesweeper (englisch mine sweeper: �Minenr�umer�) ist ein simples, dem Betriebssystem Microsoft Windows bis einschlie�lich der Version Windows 7 beigelegtes Computerspiel, bei dem der Spieler durch eine Kombination aus logischem Denken und (bisweilen) zuf�lligem Raten herausfinden soll, unter welchen Feldern �Minen� versteckt sind. Das Ziel ist, alle Felder aufzudecken, hinter welchen keine Minen verborgen sind. Als zus�tzliche Herausforderung l�uft eine Stoppuhr, sodass das Spiel zumeist auf Zeit gespielt wird, wobei die tieferen logischen Herausforderungen des Spiels kaum wahrgenommen werden.",
				"C:\\Program Files\\Microsoft Games\\Minesweeper\\minesweeper.exe", false);
		gameData.add(g3);

		Game g4 = new Game("Mahjong Titans", "Genre: Familienunterhaltung", "Publisher: Microsoft Corporation", 3,
				"Microsoft Mahjong (fr�her Mahjong Titans und Taipei) ist eine Computerspielversion von Mahjong Solitaire von Microsoft ver�ffentlicht. Die Version mit dem Titel Mahjong Titans wurde von Oberon Games entwickelt und in Windows Vista und Windows 7 (au�er Starter und Home Basic Edition) enthalten. Es nutzt die neue grafische Benutzeroberfl�che (GUI) von Windows Vista und enth�lt Funktionen wie Kachel-Set und Hintergrund-Auswahl. (In Windows Vista baut 5219, 5231 und 5259, das Spiel wurde als Shanghai Solitaire bekannt.) Das Spiel hat es nicht zu Windows 8 gemacht; Jedoch kann eine eigenst�ndige Version, die von Arkadium entwickelt und von Microsoft Studios ver�ffentlicht wurde, kostenlos aus dem Windows Store heruntergeladen werden.",
				"C:\\Program Files\\Microsoft Games\\Mahjong\\mahjong.exe", false);
		gameData.add(g4);

		return gameData;
	}

}
