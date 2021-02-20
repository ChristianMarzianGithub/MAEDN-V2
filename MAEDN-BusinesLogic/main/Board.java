package main;

import java.util.ArrayList;

public class Board {
	
	private ArrayList<Figur> startField0 = new ArrayList<Figur>();
	private ArrayList<Figur> startField1= new ArrayList<Figur>();
	private ArrayList<Figur> startField2= new ArrayList<Figur>();
	private ArrayList<Figur> startField3= new ArrayList<Figur>();
	
	private ArrayList<Figur> finishField0 = new ArrayList<Figur>();
	private ArrayList<Figur> finishField1= new ArrayList<Figur>();
	private ArrayList<Figur> finishField2= new ArrayList<Figur>();
	private ArrayList<Figur> finishField3= new ArrayList<Figur>();
	
	private ArrayList<Figur> boardFields= new ArrayList<Figur>();
	
	public Board() {
		initializeStartFields();
		initializeFinishFields();
		initializeBoardFields();
	}
	
	
	private void initializeStartFields() 
	{		
		for(int i = 0; i <= 3; i++) 
		{
			startField0.add(new Figur(Farbe.gelb,0,0));
		}
		for(int i = 0; i <= 3; i++) 
		{
			startField1.add(new Figur(Farbe.gruen,0,0));
		}
		for(int i = 0; i <= 3; i++) 
		{
			startField2.add(new Figur(Farbe.blau,0,0));
		}
		for(int i = 0; i <= 3; i++) 
		{
			startField3.add(new Figur(Farbe.rot,0,0));
		}
	}
	
	private void initializeFinishFields()
	{
		for(int i = 0; i <= 3; i++) 
		{
			finishField0.add(null);
		}
		for(int i = 0; i <= 3; i++) 
		{
			finishField1.add(null);
		}
		for(int i = 0; i <= 3; i++) 
		{
			finishField2.add(null);
		}
		for(int i = 0; i <= 3; i++) 
		{
			finishField3.add(null);
		}
	}
	
	private void initializeBoardFields()//there are 39 fields
	{
		for(int i = 0; i< 39; i++)
		{
			boardFields.add(null);
		}
	}
	public ArrayList<Figur> getStartField0() {
		return startField0;
	}


	public void setStartField0(ArrayList<Figur> startField0) {
		this.startField0 = startField0;
	}


	public ArrayList<Figur> getStartField1() {
		return startField1;
	}


	public void setStartField1(ArrayList<Figur> startField1) {
		this.startField1 = startField1;
	}


	public ArrayList<Figur> getStartField2() {
		return startField2;
	}


	public void setStartField2(ArrayList<Figur> startField2) {
		this.startField2 = startField2;
	}


	public ArrayList<Figur> getStartField3() {
		return startField3;
	}


	public void setStartField3(ArrayList<Figur> startField3) {
		this.startField3 = startField3;
	}


	public ArrayList<Figur> getFinishField0() {
		return finishField0;
	}


	public void setFinishField0(ArrayList<Figur> finishField0) {
		this.finishField0 = finishField0;
	}


	public ArrayList<Figur> getFinishField1() {
		return finishField1;
	}


	public void setFinishField1(ArrayList<Figur> finishField1) {
		this.finishField1 = finishField1;
	}


	public ArrayList<Figur> getFinishField2() {
		return finishField2;
	}


	public void setFinishField2(ArrayList<Figur> finishField2) {
		this.finishField2 = finishField2;
	}


	public ArrayList<Figur> getFinishField3() {
		return finishField3;
	}


	public void setFinishField3(ArrayList<Figur> finishField3) {
		this.finishField3 = finishField3;
	}


	public ArrayList<Figur> getBoardFields() {
		return boardFields;
	}


	public void setBoardFields(ArrayList<Figur> boardFields) {
		this.boardFields = boardFields;
	}
}