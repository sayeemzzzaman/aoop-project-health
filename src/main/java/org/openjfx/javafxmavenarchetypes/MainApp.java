package org.openjfx.javafxmavenarchetypes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("main-view.fxml"));

        Parent root = FXMLLoader.load(getClass().getResource("sign-in.fxml"));
//        Scene scene = new Scene(root.load());
        Scene scene = new Scene(root);
        stage.setTitle("Sign In");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}