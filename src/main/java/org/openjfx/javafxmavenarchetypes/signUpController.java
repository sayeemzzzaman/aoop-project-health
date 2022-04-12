package org.openjfx.javafxmavenarchetypes;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class signUpController {

    public void signInButtonPressed(ActionEvent event) throws Exception{
        Parent mainViewParent = FXMLLoader.load(getClass().getResource("main-view.fxml"));
        Scene mainViewScene = new Scene(mainViewParent);

        // this line gets the stage info
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(mainViewScene);
        window.show();
    }
}
