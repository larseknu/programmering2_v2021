package no.hiof.larseknu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();
    private Stack<Card> cardStack = new Stack();

    public Deck() {
        for (Card.Suit cardSuit : Card.Suit.values()) {
            for (CardValue cardValue : CardValue.values()) {
                cards.add(new Card(cardSuit, cardValue));
            }
        }

        cardStack.addAll(cards);
    }

    public ArrayList<Card> getAllCards() {
        return cards;
    }

    public Stack<Card> getDeckOfCards() {
        return cardStack;
    }

    public void shuffleCurrentDeck() {
        Collections.shuffle(cardStack);
    }

    public void shuffleAllCards() {
        cardStack.clear();
        cardStack.addAll(cards);
        Collections.shuffle(cardStack);
    }

    public Card pickCard() {
        Card pickedCard = cardStack.pop();

        return pickedCard;
    }

    public int pickCardUntilFound(Card card) {
        int i = 1;
        Card pickedCard = pickCard();

        while ((card.getSuit() != pickedCard.getSuit()) || (card.getValue() != pickedCard.getValue())) {
            pickedCard = pickCard();
            i++;
        }

        return i;
    }

    public ArrayList<Card> drawCards(int number) {
        ArrayList<Card> drawnCards = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            drawnCards.add(pickCard());
        }

        return drawnCards;
    }

    public void printAllCards() {
        for (Card aCard : cards) {
            System.out.println(aCard);
        }
    }

}
