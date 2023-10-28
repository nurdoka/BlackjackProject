package com.skilldistillery.blackjack.entities;

import java.util.List;

public class Player {
	protected Hand hand;
	
	public Player() {
		hand = new BlackjackHand();
	}
	
	public void addCardToHand(Card card) {
		hand.addCard(card);
	}

	public int getHandValue() {
		return hand.getHandValue();
	}

	public List<Card> getHandCardList() {
		return hand.cards;
	}
	
	public boolean isBustHand() {
		return hand.isBust();
	}
}
