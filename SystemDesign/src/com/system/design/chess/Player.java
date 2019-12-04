package com.system.design.chess;

public class Player {

	private boolean whiteSide;
	private Person person;
	
	public Player(boolean whiteSide, Person person) {
		super();
		this.whiteSide = whiteSide;
		this.person = person;
	}

	public boolean isWhiteSide() {
		return whiteSide;
	}

	public void setWhiteSide(boolean whiteSide) {
		this.whiteSide = whiteSide;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}