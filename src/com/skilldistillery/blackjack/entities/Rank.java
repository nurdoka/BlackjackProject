package com.skilldistillery.blackjack.entities;

public enum Rank {
	TWO(2, "Two"), THREE(3, "Three"), FOUR(4, "Four"), FIVE(5, "Five"), SIX(6, "Six"), SEVEN(7, "Seven"),
	EIGHT(8, "Eight"), NINE(9, "Nine"), TEN(10,"Ten"), JACK(10,"Jack"), QUEEN(10,"Queen"), KING(10,"King"), ACE(11,"Ace");

	final private int value;
	final private String name;

	private Rank(int v, String name) {
		value = v;
		this.name = name;
	}
	

	public String getName() {
		return name;
	}


	public int getValue() {
		return value;
	}
}
