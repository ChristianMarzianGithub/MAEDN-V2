package main;

import java.util.ArrayList;

public class Game {

	private ArrayList<Player> playerListe = new ArrayList<Player>(); 
	
	public Phase phase = Phase.Wuerfeln;
	private Board board;
	
	public Game() {
		playerListe.add(new Player(Farbe.blau,39));
		playerListe.add(new Player(Farbe.rot,39));
		playerListe.add(new Player(Farbe.gelb,39));
		playerListe.add(new Player(Farbe.gruen,39));
		setBoard(new Board());
		
	}
	
	public WuerfelResult wuerfeln() {
		phase = Phase.Setzen;
		WuerfelResult wr = new WuerfelResult();
		wr.setResult((int) (Math.random() * 6 + 1));
		return wr;		
	}

	public ArrayList<Player> getPlayerListe() {
		return playerListe;
	}

	public void setPlayerListe(ArrayList<Player> playerListe) {
		this.playerListe = playerListe;
	}

	
	public int figurSetzen(int zuWuerfelndeZahl, int indexVonSpielerDerMomentanDranIst) {
		// TODO Auto-generated method stub
		Figur f = playerListe.get(indexVonSpielerDerMomentanDranIst).getFigurenListe().get(1);
		f.setPosition(f.getPosition() + zuWuerfelndeZahl);
		return getNaechstenSpieler(indexVonSpielerDerMomentanDranIst);
	}

	private int getNaechstenSpieler(int indexVonSpielerDerMomentanDranIst) 
	{
		// TODO Auto-generated method stub
		
		if(indexVonSpielerDerMomentanDranIst == 3)
		{
			return 0;
		}else
		{
			return indexVonSpielerDerMomentanDranIst + 1;
		}
	}

	public void gibPositionenAllerFigurenAus(int gewuerfelteZahl) 
	{
		System.out.println("gewürfelte Zahl: " + gewuerfelteZahl + " \n");
		for(Player player: playerListe) 
		{
			System.out.println("Player: " + playerListe.indexOf(player));
			
			for(Figur figur: player.getFigurenListe()) 
			{
				System.out.println("Figur: " + player.getFigurenListe().indexOf(figur));
				System.out.println("Position: " + figur.getPosition());
			}
			System.out.println("");
		}
		
		
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
	
	/*
	@Override
	public String toString() {
		
		
		
		return String.format(
				"Movie[id='%d', name='%s', genre='%s', bewertung='%s']", id,name,genre,bewertung			
				);
	}
	*/

	
	
}
