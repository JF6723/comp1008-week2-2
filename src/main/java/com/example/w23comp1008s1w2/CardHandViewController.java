package com.example.w23comp1008s1w2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

//implements Initializable means the CardHandViewController is also an Initializable
//Initializable is an Interface that defines we must have a method called Initialize
public class CardHandViewController implements Initializable {

    @FXML
    private Label colourLabel;

    @FXML
    private Label faceNameLabel;

    @FXML
    private ImageView imageView;

    @FXML
    private Label suitLabel;

    @FXML
    private Label valueLabel;

    private DeckOfCards deck;

    @FXML
    void dealNextCard() {
        Card cardSelected = deck.dealTopCard();
        faceNameLabel.setText("Face Name: "+cardSelected.getFaceName());
        colourLabel.setText("Colour: "+cardSelected.getColour());
        suitLabel.setText("Suit: "+cardSelected.getSuit());
        valueLabel.setText("Value: " + cardSelected.getCardValue());
        imageView.setImage(cardSelected.getImage());
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        deck = new DeckOfCards();
        dealNextCard();
    }
}
