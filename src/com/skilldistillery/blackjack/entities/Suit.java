package com.skilldistillery.blackjack.entities;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	final private String name;

	private Suit(String n) {
		name = n;
	}

	@Override
	public String toString() {
		return name;
	}

}
