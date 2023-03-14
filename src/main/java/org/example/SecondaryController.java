package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import java.io.IOException;
import Logica.Principal;



public class SecondaryController {


    @FXML
    private TextArea textoEncriptar;

    @FXML
    private Label textoEncriptado;
    
    
    

    @FXML
    void btnencriptar(ActionEvent event) {
       
        String texto=textoEncriptar.getText();
        texto=Principal.encriptar(texto);
        textoEncriptado.setText(texto);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("TEXTO ENCRIPTADO");
        alert.setContentText(texto);
        alert.showAndWait();

    }

    @FXML
    private void switchToPrimary() throws IOException {

        App.setRoot("primary");
    }
}