package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;

import Logica.Principal;

public class TertiaryController {
    @FXML
    private TextArea textoDesencriptar;

    @FXML
    private Label textoDesencriptado;

    public void switchToPrimary(ActionEvent actionEvent)throws IOException {
            App.setRoot("primary");
    }

    public void btndesencriptar(ActionEvent actionEvent) {
        
        String texto=textoDesencriptar.getText();
        texto=Principal.desencriptar(texto);
        textoDesencriptado.setText(texto);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("TEXTO DESENCRIPTADO");
        alert.setContentText(texto);
        alert.showAndWait();
    }

}
