package main;

import java.util.ArrayList;

public class Player {
	
	private ArrayList <Figur> figurenListe = new ArrayList<Figur>();
	
	public Player(Farbe farbe,int anzahlSpielFeldPositionen) {
		getFigurenListe().add(new Figur(farbe,0,anzahlSpielFeldPositionen));
		getFigurenListe().add(new Figur(farbe,0,anzahlSpielFeldPositionen));
		getFigurenListe().add(new Figur(farbe,0,anzahlSpielFeldPositionen));
		getFigurenListe().add(new Figur(farbe,0,anzahlSpielFeldPositionen));
	}

	public ArrayList <Figur> getFigurenListe() {
		return figurenListe;
	}

	public void setFigurenListe(ArrayList <Figur> figurenListe) {
		this.figurenListe = figurenListe;
	}
}
