package org.example.repaso_examen;

import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;
import java.util.ResourceBundle;

public class VetAppController implements Initializable {
    @FXML
    private Label welcomeText;



    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private ComboBox<Propietario> comboBoxPrueba;

    @FXML
    protected void ComboBox onComboPrueba(ActionEvent Action){

    }
    

    //objeto de sql
    private SQLAccessVetDaw sql = new SQLAccessVetDaw();
    // observable list de tipo persona
    //ponemos el listview con @FXML

    //dentro de inizializable
    List<Mascota> mascotas = sql.getAllMascotas();

//    (aqui va la observablelist).addAll(mascotas);
//    listview.setItems(mascotas);



    //utilizacion del epoch
    //dentro del inizialice


Mascota mascota;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ZoneId zoneId = ZoneId.of("Europe/Madrid");
        LocalDateTime.now().atZone(zoneId).getOffset();

        long fechaLong = LocalDateTime.now().toInstant(LocalDateTime.now().atZone(zoneId).getOffset()).getEpochSecond();

        Consulta con = new Consulta(fechaLong, 60, "nada", mascota);
    }
}