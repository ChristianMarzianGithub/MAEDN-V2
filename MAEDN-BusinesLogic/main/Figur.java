package main;

public class Figur {
	
	private int _anzahlSpielFeldPositionen = 0;
	
	public Figur(Farbe farbe, int position, int anzahlSpielFeldPositionen) {
		setFarbe(farbe);
		setPosition(position);
		_anzahlSpielFeldPositionen = anzahlSpielFeldPositionen;
	}
	
	
	
	private Farbe farbe;
	private int position;
	
	public Farbe getFarbe() {
		return farbe;
	}
	public void setFarbe(Farbe farbe) {
		this.farbe = farbe;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		
		if(position > _anzahlSpielFeldPositionen )
		{
			position = position - _anzahlSpielFeldPositionen; 
		}
		
		this.position = position;
	}
}