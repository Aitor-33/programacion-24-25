package org.example.repaso_examen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class VetApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VetApp.class.getResource("VetAppView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setTitle("VetDaw");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {


        try (Connection connection = SQLDatabaseManager.getConnection()) {
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos.");

                SQLAccessVetDaw vetDawAccess = new SQLAccessVetDaw();

                for(Mascota m : vetDawAccess.getAllMascotas()){
                    System.out.println(m);

                }

                Mascota m = vetDawAccess.getMascotaPorPasaporte("P00000007");
                System.out.println("FILTRO DE MASCOTA");
                System.out.println(m);


                launch();


            } else {
                System.out.println("Error al conectar con la base de datos.");

            }
        } catch (SQLException e) {
            System.out.println("Error al probar la conexión: " + e.getMessage());

        }
    }
}