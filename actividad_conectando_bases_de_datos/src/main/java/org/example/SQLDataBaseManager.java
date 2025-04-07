package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDataBaseManager {

private static String DRIVER ;
private static String URL ;
private static String SCHEMA ;
private static String USUARIO ;
private static String CLAVE;

    public static Connection getConnection(){
        Connection connection = null;

        try(FileReader fichero = new FileReader("recursos/aplication.dat");
            BufferedReader lector = new BufferedReader(fichero)) {
            String linea = lector.readLine();
            while (linea != null) {
                String[] credenciales = linea.split(",");
                DRIVER = credenciales[0];
                URL = credenciales[1];
                SCHEMA = credenciales[2];
                USUARIO = credenciales[3];
                CLAVE = credenciales[4];

                linea = lector.readLine();
            }

        } catch (Exception e) {
            System.out.println("Error al leer el fichero de credenciales: " + e.getMessage());
        }

        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL+SCHEMA, USUARIO, CLAVE);

        } catch (ClassNotFoundException e) {
            System.out.println("Error de acceso al driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }

        return connection;
    }


}
