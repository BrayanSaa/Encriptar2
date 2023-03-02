package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import java.io.IOException;



public class SecondaryController {


    @FXML
    private TextArea textoEncriptar;

    @FXML
    private Label textoEncriptado;

    @FXML
    void btnencriptar(ActionEvent event) {
        textoEncriptado.setText(textoEncriptar.getText());

    }

    @FXML
    private void switchToPrimary() throws IOException {

        App.setRoot("primary");
    }
}