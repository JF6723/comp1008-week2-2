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
        this.suit = suit;
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

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString()
    {
        return faceName + " of " + suit;
    }
}
