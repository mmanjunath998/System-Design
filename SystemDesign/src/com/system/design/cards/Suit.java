package com.system.design.cards;

public enum Suit {

	SPADE(1),
	HEART(2),
	CLUB(3),
	DIAMOND(4);
	
	private int value;
	
	private Suit(int value){
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
