# BlackjackProject

# Description
Create a class structure that models a Deck of cards. Remember a Deck holds Cards, and cards are dealt to Hands which will hold the dealt cards. The Hands are attached to a Player (Dealer and Player).

User Story #2
Add methods and fields to your classes that model the functionality of shuffling and dealing a deck of cards. Remember that when a Card is dealt, the Dealer removes a card from the deck to deal to a specific player's hand.

User Story #3
Deal two hands of cards - one to a Dealer and another to a Player. As the Dealer deals a Card from the deck, the card will be placed into the Hand of either the Dealer or the Player.

User Story #4
The Dealer's decisions are based on basic BlackJack game logic in the program:

The Dealer decides to Hit or Stand based on the rules of Blackjack: if the Dealer's hand total is below 17, the Dealer must Hit; if the hand total is 17 or above, the Dealer must Stand (the "rule of 17").

Your program must display the dealt cards in each player's hand (including Dealer's) per the rules of Blackjack. For example, the first round dealt looks like:

1st card - face up (displayed) to Player
2nd card - face down (not displayed) to Dealer
3rd card - face up (displayed) to Player
4th card - face up (displayed) to Dealer
After the 1st round of cards are dealt, allow the player to Hit (add cards to their hand) or Stand (not add cards to their hand) according to how lucky the player is feeling.

After the Player announces "Stand", then it's the Dealer's turn. Dealer abides by the "rule of 17".

Do not worry about the multiple values for Ace until your basic game logic is working. Assume they are either 1 or 11 (you decide).

User Story #5
Determine and display the winner of each round, where the winner is the player (either Dealer or Player) closest to 21, without going over 21.

Stretch Goals
Try as many of these as you like, but ONLY after you've completed, tested, and COMMITTED your working game that meets the requirements.

"Soft" Ace - Ace has the value 1 or 11.

A dealer must Hit on a hand with the value "soft 17" (where an Ace is present with value 11 and other cards total 6) and Stay on "hard 17" (where an Ace is present, but hitting could cause the Dealer to go over 21)
"Blackjack" hand - if the user is initially dealt an Ace and a card with the value 10, this is a blackjack (ie: 2-cards only). The user immediately wins unless the dealer also has a blackjack (two-card hand with an Ace and a 10-value card).
# Tech Used
*Eclipse
*Java
# Lessons Learned
*Building classes in an Object-Oriented manner: APIE.
*Building classes whose fields are Objects (has-a).
*Writing methods.
*Using collections to organize and manage data.
*Using conditionals to create game logic.
*Considering common data and behaviors, and refactoring into parent / child classes.