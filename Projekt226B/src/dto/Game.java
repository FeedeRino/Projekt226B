package dto;

public class Game {

	private String Titel;
	private String Genre;
	private String Publisher;
	private int Altersfreigabe;
	private String Beschreibung;
	private String Pfad;
	private boolean Startauswahl;

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

	public boolean isStartauswahl() {
		return Startauswahl;
	}

	public void setStartauswahl(boolean startauswahl) {
		Startauswahl = startauswahl;
	}

}
