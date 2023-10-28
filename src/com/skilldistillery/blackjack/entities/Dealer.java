package com.skilldistillery.blackjack.entities;

public class Dealer extends Player{
	private Deck deck;
	
	public Dealer() {
		deck = new Deck();
	}
	
	public void shuffleDeck() {
		deck.shuffle();
	}
	
	public Card dealCardToHand() {
		return deck.dealCard();
	}
}
