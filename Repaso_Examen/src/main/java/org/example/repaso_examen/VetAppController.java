package org.example.repaso_examen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class VetAppController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}