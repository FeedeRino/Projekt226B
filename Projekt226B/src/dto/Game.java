package dto;


//Diese Klasse ist das Herzstück der Daten ier wird deklariert, was ein Spiel haben muss

public class Game {

	private String Titel;
	private String Genre;
	private String Publisher;
	private int Altersfreigabe;
	private String Beschreibung;
	private String Pfad;
	private boolean Startauswahl;

	
	//Im Konstruktor wird gesagt, welche Daten dieser braucht um ein Objekt vom Typ Game zu erstellen
	
	public Game(String titel, String genre, String publisher, int altersfreigabe, String beschreibung, String pfad,
			boolean startauswahl) {
		super();
		Titel = titel;
		Genre = genre;
		Publisher = publisher;
		Altersfreigabe = altersfreigabe;
		Beschreibung = beschreibung;
		Pfad = pfad;
		Startauswahl = startauswahl;
	}

	public String getTitel() {
		return Titel;
	}

	public void setTitel(String titel) {
		Titel = titel;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public int getAltersfreigabe() {
		return Altersfreigabe;
	}

	public void setAltersfreigabe(int altersfreigabe) {
		Altersfreigabe = altersfreigabe;
	}

	public String getBeschreibung() {
		return Beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		Beschreibung = beschreibung;
	}

	public String getPfad() {
		return Pfad;
	}

	public void setPfad(String pfad) {
		Pfad = pfad;
	}

	public boolean getStartauswahl() {
		return Startauswahl;
	}

	public void setStartauswahl(boolean startauswahl) {
		Startauswahl = startauswahl;
	}

}
