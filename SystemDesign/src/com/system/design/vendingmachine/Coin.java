package com.system.design.vendingmachine;

public class Coin {

	private String name;
	private int denomination;
	
	public Coin(String name, int denomination){
		this.name = name;
		this.denomination = denomination;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDenomination() {
		return denomination;
	}

	public void setDenomination(int denomination) {
		this.denomination = denomination;
	}
}
