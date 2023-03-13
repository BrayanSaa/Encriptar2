package org.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;

import static org.example.App.loadFXML;

public class PrimaryController {

    @FXML

    public void btnDesencriptar(ActionEvent actionEvent) throws IOException {
        App.setRoot("tertiary");
    }

    public void btnEncriptar(ActionEvent actionEvent) throws IOException {
        App.setRoot("secondary");
    }
}