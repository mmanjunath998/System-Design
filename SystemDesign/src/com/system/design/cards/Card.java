package com.system.design.cards;

public class Card {

	private int faceValue;
	private Suit suit;
	
	public Card(int faceValue, Suit suit){
		this.faceValue = faceValue;
		this.suit = suit;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
}
