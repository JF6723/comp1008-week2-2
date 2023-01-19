package com.example.w23comp1008s1w2;

import java.util.Arrays;
import java.util.List;

public class Card {
    //These are "instance variables".  When you create an instance of your class
    //the system will reserve space in memory to store these items
    private String faceName;
    private String suit;

    /**
     * This is a constructor.  It is called when we want to instantiate (create an
     * instance) of our object.
     * It looks like a method, but does not have a return type and must have the
     * exact same name as the class
     */
    public Card(String faceNumber, String suit)
    {
        setFaceName(faceNumber);
       setSuit(suit);
    }

    public String getFaceName() {
        return faceName;
    }

    /**
     * This method returns all the valid face names for Card objects
     */
    public static List<String> getValidFaceNames()
    {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    }

    /**
     * This method returns a list of valid suits
     * @return "hearts","diamonds","spades","clubs"
     */
    public static List<String> getValidSuits()
    {
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }

    /**
     * Validates that the argument (input) is a valid face name
     * @param faceName "2","3","4"...,"9","10","jack","queen","king","ace"
     */
    public void setFaceName(String faceName) {
        if (getValidFaceNames().contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + " must be in the list of "
              + getValidFaceNames());
    }

    public String getSuit() {
        return suit;
    }

    /**
     * This will validate the suit and set the instance variable
     * @param suit "hearts","diamonds","spades","clubs"
     */
    public void setSuit(String suit) {
        if (getValidSuits().contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " is not a valid suit, use one of " +
                    getValidSuits());
    }

    @Override
    public String toString()
    {
        return faceName + " of " + suit;
    }
}
