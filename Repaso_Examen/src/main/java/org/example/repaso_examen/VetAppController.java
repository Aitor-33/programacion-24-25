package org.example.repaso_examen;

import javafx.beans.Observable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.List;

public class VetAppController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    //objeto de sql
    private SQLAccessVetDaw sql = new SQLAccessVetDaw();
    // observable list de tipo persona
    //ponemos el listview con @FXML

    //dentro de inizializable
    List<Mascota> mascotas = sql.getAllMascotas();

    (aqui va la observablelist).addAll(mascotas);
    listview.setItems(mascotas);
}