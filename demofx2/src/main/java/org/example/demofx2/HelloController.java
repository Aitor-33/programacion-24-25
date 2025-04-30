package org.example.demofx2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.awt.*;


public class HelloController {

    private Persona persona;

    @FXML
    private Label welcomeText;

    @FXML
    private TextField nombreTextField;

    @FXML
    private TextField apellidosTextField;

    @FXML
    private TextField edadTextField;

    @FXML
    private TextField telefonoTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    protected void oncloseBtnAction(ActionEvent event) {
        Platform.exit();

    }

    @FXML
    public void onsaveBtnAction(ActionEvent event) {

        try {
            persona = new Persona();
            persona.setNombre(nombreTextField.getText());
            persona.setApellido(apellidosTextField.getText());
            persona.setEmail(emailTextField.getText());
            persona.setTelefono(telefonoTextField.getText());
            persona.setEdad(Integer.parseInt(edadTextField.getText()));

        } catch (NumberFormatException e) {
            edadTextField.setText("");
            edadTextField.requestFocus();
            edadTextField.setPromptText("Escriba un numero porfavor");

        }
    }

}