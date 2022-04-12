package org.openjfx.javafxmavenarchetypes;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class signInController {

    @FXML
    private Label signUp;

    public void signUp(MouseEvent event) throws Exception{
        Parent mainViewParent = FXMLLoader.load(getClass().getResource("sign-up.fxml"));
        Scene mainViewScene = new Scene(mainViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        signUp.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                window.setScene(mainViewScene);
                window.show();
            }
        });

    }

    public void signInButtonPressed(ActionEvent event) throws Exception{
        Parent mainViewParent = FXMLLoader.load(getClass().getResource("main-view.fxml"));
        Scene mainViewScene = new Scene(mainViewParent);

        // this line gets the stage info
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(mainViewScene);
        window.show();
    }
}
