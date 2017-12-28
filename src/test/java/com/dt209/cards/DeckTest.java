package com.dt209.cards;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {
    @Test
    public void creationProducesIdentialResultsTest() {
        Deck deck = new Deck();
        Deck.Card firstCard = deck.dealFirst();
        assertNotNull(firstCard);
        deck = new Deck();
        Deck.Card secondCard = deck.dealFirst();
        assertEquals(firstCard, secondCard);
    }

    @Test
    public void dealTest() {
        Deck deck = new Deck().shuffle();
        Deck.Card firstCard = deck.dealFirst();
        assertNotNull(firstCard);
    }

    @Test
    public void shuffleTest() {
        Deck deck = new Deck().shuffle();
        Deck.Card firstCard = deck.dealFirst();
        Deck.Card secondCard = deck.shuffle().dealFirst();
        assertFalse(firstCard + " should not be the same as " + secondCard + " however it is possible that " +
                "this test will fail if the same card is shuffled into the first position twice. Try running this test " +
                "again, if it still fails there is something wrong with the code", firstCard.equals(secondCard));
    }
}
