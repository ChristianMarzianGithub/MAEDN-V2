package main;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anzahlSpielFeldPositionen = 40;
		Game game = new Game();
		
		int zuWuerfelndeZahl = 0;
		int indexSpielerDerMomentanDranIst = 0;
		
		
		while(true) {
			
			zuWuerfelndeZahl = game.wuerfeln();
			indexSpielerDerMomentanDranIst = game.figurSetzen(zuWuerfelndeZahl,indexSpielerDerMomentanDranIst);
			
			
			game.gibPositionenAllerFigurenAus(zuWuerfelndeZahl);
			
			
			
			
			System.out.println("--Nächster Spieler ist dran mit Würfeln--");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}	
}