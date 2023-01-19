package com.example.w23comp1008s1w2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card("Ace","CLUBs");
        System.out.println(card1.toString());

        System.out.println(card1 + " colour: " + card1.getColour());
        System.out.println(card1 + " value: " + card1.getCardValue());

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        ArrayList<Card> hand1 = new ArrayList<>();
        ArrayList<Card> hand2 = new ArrayList<>();

        for (int i=1; i<=5 ; i++)
        {
            hand1.add(deck.dealTopCard());
            hand2.add(deck.dealTopCard());
        }

        System.out.println("Hand 1: "+hand1);
        System.out.println("Hand 2: "+hand2);
    }
}
