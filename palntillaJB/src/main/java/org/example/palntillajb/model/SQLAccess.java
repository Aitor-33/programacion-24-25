package org.example.palntillajb.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class SQLAccess {
    public static List<Mascota> getMascotas() {
        List<Mascota> productos = new LinkedList<>();
        //Sentencia a la base de datos
        String getProducts = "SELECT * FROM Mascota";

        try (Connection connection = SQLDataBaseManager.getConnection(); Statement statement = connection.createStatement();
             ResultSet dataSet = statement.executeQuery(getProducts)){
            while (dataSet.next()){
                String pasaporte = dataSet.getString("Pasaporte");
                String nombre = dataSet.getString("Nombre");
                Double peso = dataSet.getDouble("Peso");
                LocalDateTime fechaNacimiento = LocalDateTime.parse(dataSet.getString("f_nacimiento"));
                String tipo = dataSet.getString("Tipo");
                Propietario propietario = dataSet.getObject("Propietario", Propietario.class);

                Mascota m = new Mascota(pasaporte, nombre, peso, fechaNacimiento, tipo, propietario);
                productos.add(m);
            }
        }catch (Exception e){
            System.out.println("Error al obtener los productos: " + e.getMessage());
        }
        return productos;
    }






    public static List<Mascota> getMascotabyPasaporte(String nombredemascota){
        List<Mascota> productos = new LinkedList<>();
        //Sentencia a la base de datos
        String getProducts = "SELECT * FROM Mascota WHERE Pasaporte = ?";
        try(Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(getProducts);){
            statement.setString(1, nombredemascota);
            ResultSet dataSet = statement.executeQuery();
            while (dataSet.next()){
                String pasaporte = dataSet.getString("Pasaporte");
                String nombre = dataSet.getString("Nombre");
                Double peso = dataSet.getDouble("Peso");
                LocalDateTime fechaNacimiento = LocalDateTime.parse(dataSet.getString("f_nacimiento"));
                String tipo = dataSet.getString("Tipo");
                Propietario propietario = dataSet.getObject("Propietario", Propietario.class);

                Mascota m = new Mascota(pasaporte, nombre, peso, fechaNacimiento, tipo, propietario);
                productos.add(m);
            }
        } catch (Exception e){
            System.out.println("Error al obtener los productos: " + e.getMessage());
        }
        return productos;
    }




    public static int añadirMascota(Mascota mascota){
        int response = -1;
        String añadirProducto = "INSERT INTO Mascota (Pasaporte, Nombre, Peso, FechaNacimiento, Propietario_dni, Tipo_idTipo) VALUES (?,?,?,?,?,?)";

        try(Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(añadirProducto);) {
            statement.setNString(1, mascota.getPasaporte());
            statement.setNString(2, mascota.getNombre());
            statement.setNString(3, mascota.getFechaNacimiento().toString());
            statement.setDouble(4, mascota.getPeso());
            statement.setNString(5, mascota.getPropietario().getNombre());
            statement.setNString(6, mascota.getTipo());


            response = statement.executeUpdate();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return response;
    }




    public static int editarProducto(Mascota mascota){
        int response = -1;
        String editarProducto = "UPDATE Mascota SET Pasaporte = ?, Nombre = ?, Peso = ?, FechaNacimiento = ?, Propietario_dni = ?, Tipo_idTipo = ? WHERE id = ?";

        try(Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(editarProducto);) {
            statement.setNString(1, mascota.getPasaporte());
            statement.setNString(2, mascota.getNombre());
            statement.setNString(3, mascota.getPeso().toString());
            statement.setNString(4, mascota.getFechaNacimiento().toString());
            statement.setNString(5, mascota.getPropietario().getNombre());
            statement.setNString(6, mascota.getTipo());

            response = statement.executeUpdate();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return response;
    }



/*    public static int Propietario(Propietario propietario){
        int response = -1;
        String añadirProducto = "INSERT INTO Propietario (Pasaporte, Nombre, Peso, FechaNacimiento, Propietario_dni, Tipo_idTipo) VALUES (?,?,?,?,?,?)";

        try(Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(añadirProducto);) {
            statement.setNString(1, mascota.getPasaporte());
            statement.setNString(2, mascota.getNombre());
            statement.setNString(3, mascota.getFechaNacimiento().toString());
            statement.setDouble(4, mascota.getPeso());
            statement.setNString(5, mascota.getPropietario().getNombre());
            statement.setNString(6, mascota.getTipo());


            response = statement.executeUpdate();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return response;
    }*/
}
