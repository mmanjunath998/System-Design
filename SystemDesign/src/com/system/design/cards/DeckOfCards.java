package com.system.design.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DeckOfCards {

	List<Card> deckCard;
	public DeckOfCards(){
		deckCard = new ArrayList<>();
		
		for(int i=1; i<=13; i++){
			
			for(Suit suit : Suit.values()){
				deckCard.add(new Card(i, suit));
			}
		}
	}
	
	public void shuffle(int times){
		Random random = new Random();
		for(int i=1; i<=times; i++){
		int firstRandom = random.nextInt(52);
		int secondRandom = random.nextInt(52);
		Collections.swap(deckCard, firstRandom, secondRandom);
		}
	}
	
	public static void main(String[] args){
		DeckOfCards deck = new DeckOfCards();
		printDeckOfCards(deck);
		deck.shuffle(20);
		System.out.println("shuffle.......");
		printDeckOfCards(deck);
	}

	private static void printDeckOfCards(DeckOfCards deck) {
		for(Card card : deck.deckCard){
			System.out.println(card.getSuit().name()+" : "+card.getFaceValue());
		}
	}
	
	
	
	
	
}
