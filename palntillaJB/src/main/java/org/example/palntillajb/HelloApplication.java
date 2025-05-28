package org.example.palntillajb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.palntillajb.model.SQLDataBaseManager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HelloView.fxml"));
    Parent root = fxmlLoader.load();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle("Hello World");
    stage.show();
    }

    public static void main(String[] args) {
        // Iniciar la conexión a la base de datos
        try (Connection connection = SQLDataBaseManager.getConnection()) {
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                launch();
            } else {
                System.out.println("Error al conectar con la base de datos.");
                launch();
            }
        } catch (SQLException e) {
            System.out.println("Error al probar la conexión: " + e.getMessage());
            launch();
        }
    }
}