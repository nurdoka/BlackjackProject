package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {
	private Player player = new Player();
	private Dealer dealer = new Dealer();

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.run();

	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		dealer.shuffleDeck();
		firstRoundDealingCards();

		String choice = "";
		do {
			displayHandsPlayerTurn();
			if(player.getHandValue() == 21) {
				System.out.println("Blackjack!!!");
				System.out.println("Player won!!!");
				System.exit(0);
			}
			System.out.println("Do you wanna Hit or Stand?: ");
			choice = sc.next();
			if (choice.toUpperCase().equals("HIT")) {
				player.addCardToHand(dealer.dealCardToHand());
			}
			
		} while (!choice.toUpperCase().equals("STAND") && !player.isBustHand());

		if (player.isBustHand()) {
			displayHandsDealerTurn();
			System.out.println("Dealer won!!!");
			System.exit(0);
		}
		displayHandsDealerTurn();
		while (dealer.getHandValue() < 17) {
			dealer.addCardToHand(dealer.dealCardToHand());
			displayHandsDealerTurn();
		}

		if (dealer.isBustHand()) {
			System.out.println("Player won!!!");
			System.exit(0);
		}

		if (player.getHandValue() > dealer.getHandValue())
			System.out.println("Player won!!!");
		else if (player.getHandValue() < dealer.getHandValue())
			System.out.println("Dealer won!!!");
		else
			System.out.println("Push!!!");
sc.close();
	}

	public void firstRoundDealingCards() {
		player.addCardToHand(dealer.dealCardToHand());
		dealer.addCardToHand(dealer.dealCardToHand());
		player.addCardToHand(dealer.dealCardToHand());
		dealer.addCardToHand(dealer.dealCardToHand());
	}

	public void displayHandsDealerTurn() {
		System.out.println("Player's hand: " + player.getHandCardList() + " ---The value is: " + player.getHandValue());

		System.out.println("Dealer's hand: " + dealer.getHandCardList() + " ---The value is: " + dealer.getHandValue());
	}

	public void displayHandsPlayerTurn() {
		System.out.println("Player's hand: " + player.getHandCardList() + " ---The value is: " + player.getHandValue());

		System.out.println("Dealer's hand: " + dealer.getHandCardList().get(0)
				+ ", second hand is facedown ---The value is: " + dealer.getHandCardList().get(0).getValue());
	}

}
