package com.example.w23comp1008s1w2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CardApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CardApplication.class.getResource("card-hand-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Super Awesome Card Viewer 3000");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}