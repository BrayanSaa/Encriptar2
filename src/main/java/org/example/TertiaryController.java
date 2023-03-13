package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class TertiaryController {
    @FXML
    private TextArea textoDesencriptar;

    @FXML
    private Label textoDesencriptado;

    public void switchToPrimary(ActionEvent actionEvent)throws IOException {
            App.setRoot("primary");
    }

    public void btndesencriptar(ActionEvent actionEvent) {
        textoDesencriptado.setText(textoDesencriptar.getText());
    }

}
