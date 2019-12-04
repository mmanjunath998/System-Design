package com.system.design.cards;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand;
	private String name;
	
	public Player(String name){
		this.name = name;
		hand = new ArrayList<>();
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
