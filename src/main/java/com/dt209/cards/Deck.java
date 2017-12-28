package com.dt209.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Represents a Standard 52-card deck.
 * @see <a href="https://en.wikipedia.org/wiki/Standard_52-card_deck">https://en.wikipedia.org/wiki/Standard_52-card_deck</a>
 */
public class Deck {
    private List<Card> deck = new ArrayList<>();

    /**
     * Create a new un-shuffled Standard 52-card deck.
     */
    public Deck() {
        for (Suit suit: Suit.values()) {
            for (Rank rank: Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    /**
     * @return shuffled deck
     */
    public Deck shuffle() {
        Collections.shuffle(deck);
        return this; // Allow for method chaining
    }

    /**
     * @return first card in the deck
     */
    public Card dealFirst(){
        return deck.iterator().next();
    }

    /**
     * Immutable card class
     */
    public class Card {
        private Suit suit;
        private Rank rank;

        /**
         * Only allow a card to be created by the Deck.
         */
        private Card(Suit suit, Rank rank) {
            this.suit = suit;
            this.rank = rank;
        }

        public Suit getSuit() {
            return suit;
        }

        public Rank getRank() {
            return rank;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Card card = (Card) o;
            return suit == card.suit &&
                    rank == card.rank;
        }

        @Override
        public int hashCode() {
            return Objects.hash(suit, rank);
        }

        @Override
        public String toString() {
            return "Card{" +
                    "suit=" + suit +
                    ", rank=" + rank +
                    '}';
        }
    }
}
