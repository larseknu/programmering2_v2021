package no.hiof.larseknu;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Deck normalDeck = new Deck();

	    normalDeck.printAllCards();
	    normalDeck.shuffleAllCards();

	    ArrayList<Card> yourHand = normalDeck.drawCards(5);
        System.out.println(yourHand);

        Card aceOfSpades = new Card(Card.Suit.SPADES, CardValue.ACE);
        int numberOfCards = normalDeck.pickCardUntilFound(aceOfSpades);
        System.out.printf("It took %d draws to find %s\n", numberOfCards, aceOfSpades);

        Card pickedCard = normalDeck.pickCard();
        System.out.println("Card drawn: " + pickedCard);

        switch (pickedCard.getSuit()) {
            case SPADES -> System.out.println("Spades is the best " + pickedCard.getValue());
            case HEARTS -> System.out.println("Hearts means true love " + pickedCard.getValue());
            case CLUBS -> System.out.println("Lucky, it was clubs " + pickedCard.getValue());
            case DIAMONDS -> System.out.println("A girls best friend " + pickedCard.getValue());
        }
    }
}
