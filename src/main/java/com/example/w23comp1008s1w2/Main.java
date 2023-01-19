package com.example.w23comp1008s1w2;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card("Ace","CLUBs");
        System.out.println(card1.toString());

        System.out.println(card1 + " colour: " + card1.getColour());
        System.out.println(card1 + " value: " + card1.getCardValue());

        DeckOfCards deck = new DeckOfCards();

    }
}
