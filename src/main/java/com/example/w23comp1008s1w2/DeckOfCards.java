package com.example.w23comp1008s1w2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards()
    {
        deck = new ArrayList<>();
        List<String> suits = Card.getValidSuits();
        List<String> faceNames = Card.getValidFaceNames();

        for (int i=0; i< suits.size(); i++)
        {
            for (String faceName : faceNames)
                deck.add(new Card(faceName, suits.get(i)));
        }
    }

    /**
     * This method will "deal" the top card from the deck
     */
    public Card dealTopCard()
    {
        if (deck.size()>0)
            return deck.remove(0);
        else
            return null;
    }

    public void shuffle()
    {
        Collections.shuffle(deck);
    }
}
