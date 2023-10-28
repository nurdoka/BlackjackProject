package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> cards;
	
	public Hand() { 
		cards = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public abstract int getHandValue();
	
	public abstract boolean isBust();

	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}
	
}
