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
        //textoDesencriptado.setText(textoDesencriptar.getText());
        String texto=textoDesencriptar.getText();
     
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("TEXTO DESENCRIPTADO");
        alert.setContentText(Principal.desencriptar(texto));
        alert.showAndWait();
    }

}
