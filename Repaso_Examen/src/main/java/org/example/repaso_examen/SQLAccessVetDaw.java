package org.example.repaso_examen;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SQLAccessVetDaw {

    //obtener todos los tipos de animales de la base de datos
    public List<Tipo> getAllTipos() {
        List<Tipo> tipos = new LinkedList<Tipo>();

        String getTipos = "SELECT idTipo , Tipo FROM tipo";
        try (Connection connection = SQLDatabaseManager.getConnection(); Statement statement = connection.createStatement();
             ResultSet dataSet = statement.executeQuery(getTipos);) {
            while (dataSet.next()) {

                Tipo t = new Tipo(dataSet.getNString(2), dataSet.getInt(1));
                tipos.add(t);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return tipos;
    }



// obtener todos los propietarios de la base de datos
    public List<Propietario> getAllPropietarios() {
        List<Propietario> propietarios = new LinkedList<Propietario>();

        String getPropietarios = "SELECT * FROM propietario";
        try (Connection connection = SQLDatabaseManager.getConnection(); Statement statement = connection.createStatement();
             ResultSet dataSet = statement.executeQuery(getPropietarios);) {
            while (dataSet.next()) {

                Propietario p = new Propietario(
                        dataSet.getNString(1),
                        dataSet.getNString(2),
                        dataSet.getNString(3),
                        dataSet.getNString(4),
                        dataSet.getNString(5),
                        dataSet.getNString(6));
                propietarios.add(p);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return propietarios;
    }




    // obtener todos los propietarios de la base de datos
    public List<Mascota> getAllMascotas() {
        List<Mascota> mascotas = new LinkedList<Mascota>();

        String getMascotas = "SELECT  m.*, t.Tipo, p.* FROM mascota m " + "JOIN Tipo t ON m.Tipo_idTipo = t.idTipo " + "JOIN Propietario p ON m.Propietario_dni = p.dni";

        try (Connection connection = SQLDatabaseManager.getConnection(); Statement statement = connection.createStatement();
             ResultSet dataSet = statement.executeQuery(getMascotas);) {
            while (dataSet.next()) {

                Mascota m = new Mascota(
                        dataSet.getNString(2), //nombre
                        dataSet.getNString(1), //pasaporte
                        LocalDate.from(dataSet.getDate(4).toLocalDate()), //fecha de nacimiento
                        dataSet.getDouble(3), //peso

                        new Propietario(dataSet.getNString(8),
                                dataSet.getNString(9),
                                dataSet.getNString(10),
                                dataSet.getNString(11),
                                dataSet.getNString(12),
                                dataSet.getNString(13)),//objeto propietario

                        new Tipo(dataSet.getNString(7), dataSet.getInt(6))//objeto tipo
                );

                mascotas.add(m);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return mascotas;
    }




    //buscar mascota por pasaporte
    public Mascota getMascotaPorPasaporte(String pasaporte) {
        Mascota mascota = null;

        String getMascotasPasaporte = "SELECT m.* , p.* , t.tipo FROM Mascota m  " +
                "JOIN Propietario p ON m.Propietario_dni = p.dni " +
                "JOIN tipo t on t.idTipo = m.Tipo_idTipo " +
                "WHERE pasaporte = ?";

        try (Connection connection = SQLDatabaseManager.getConnection(); Statement statement = connection.createStatement();
             PreparedStatement statement1 = connection.prepareStatement(getMascotasPasaporte);) {

            statement1.setString(1, pasaporte);
            ResultSet dataSet = statement1.executeQuery();

            while (dataSet.next()) {

                Mascota m = new Mascota(
                        dataSet.getNString(2), //nombre
                        dataSet.getNString(1), //pasaporte
                        LocalDate.from(dataSet.getDate(4).toLocalDate()), //fecha de nacimiento
                        dataSet.getDouble(3), //peso

                        new Propietario(dataSet.getNString(8),
                                dataSet.getNString(9),
                                dataSet.getNString(10),
                                dataSet.getNString(11),
                                dataSet.getNString(12),
                                dataSet.getNString(13)),//objeto propietario

                        new Tipo(dataSet.getNString(7), dataSet.getInt(6))//objeto tipo
                );
                mascota = m;

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return mascota;
    }



    //buscar mascota por pasaporte
    public List<Mascota> getMascotaPorPropietarioDni(String dniPropietario) {
        List<Mascota> mascota = new LinkedList<>();

        String getMascotasPropietarioDni = "SELECT m.* , p.* , t.tipo FROM Mascota m  " +
                "JOIN Propietario p ON m.Propietario_dni = p.dni " +
                "JOIN tipo t on t.idTipo = m.Tipo_idTipo " +
                "WHERE p.dni = ?";

        try (Connection connection = SQLDatabaseManager.getConnection(); Statement statement = connection.createStatement();
             PreparedStatement statement1 = connection.prepareStatement(getMascotasPropietarioDni);) {

            statement1.setString(1, dniPropietario);
            ResultSet dataSet = statement1.executeQuery();

            while (dataSet.next()) {

                Mascota m = new Mascota(

                        dataSet.getNString(2), //nombre
                        dataSet.getNString(1), //pasaporte
                        LocalDate.from(dataSet.getDate(4).toLocalDate()), //fecha de nacimiento
                        dataSet.getDouble(3), //peso

                        new Propietario(dataSet.getNString(8),
                                dataSet.getNString(9),
                                dataSet.getNString(10),
                                dataSet.getNString(11),
                                dataSet.getNString(12),
                                dataSet.getNString(13)),//objeto propietario

                        new Tipo(dataSet.getNString(7), dataSet.getInt(6))//objeto tipo

                );
                mascota.add(m);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return mascota;
    }



    //insertar propietario

    public static int añadirPropietario(Propietario propietario){

        int response = -1;

        String añadirPropietarios = "INSERT INTO Propietario (dni, Nombre, Apellido, Telefono, Direccion, Email) VALUES (?,?,?,?,?,?)";

        try(Connection connection = SQLDatabaseManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(añadirPropietarios);) {

            statement.setNString(1, propietario.getDni());
            statement.setNString(2, propietario.getNombre());
            statement.setNString(3, propietario.getApellido());
            statement.setNString(4, propietario.getTelefono());
            statement.setNString(5, propietario.getDireccion());
            statement.setNString(6, propietario.getEmail());

            response = statement.executeUpdate();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return response;
    }







    //insertar mascota

    public static int añadirMascota(Mascota mascota){
        int response = -1;
        String añadirProducto = "INSERT INTO Mascota (Pasaporte, Nombre, Peso, FechaNacimiento, Propietario_dni, Tipo_idTipo) VALUES (?,?,?,?,?,?)";

        try(Connection connection = SQLDatabaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(añadirProducto);) {
            statement.setNString(1, mascota.getPasaporte());
            statement.setNString(2, mascota.getNombre());
            statement.setDouble(3, mascota.getPeso());
            statement.setDate(4, Date.valueOf(mascota.getFechaNacimiento()));//transforma el local date a date de sql
            statement.setNString(5, mascota.getPropietario().getDni());
            statement.setInt(6, mascota.getTipo().getId());


            response = statement.executeUpdate();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return response;
    }


    //insertar consulta

    public static int añadirConsulta(Consulta consulta){

        int response = -1;

        String añadirConsultas = "INSERT INTO Propietario (Fecha, Duracion, Observaciones, Mascota_Pasaporte, Mascota_Propietario_dni) VALUES (?,?,?,?,?)";

        try(Connection connection = SQLDatabaseManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(añadirConsultas);) {

            statement.setDate(1, (new Date(consulta.getFecha())));
            statement.setInt(2, consulta.getDuracion());
            statement.setNString(3, consulta.getObservaciones());
            statement.setNString(4, consulta.getMascota().getPasaporte());
            statement.setNString(5, consulta.getMascota().getPropietario().getDni());

            response = statement.executeUpdate();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return response;
    }
//localdatetime que nos devuelve la base de datos se puede pasar a long con un ofEpochSecond(consulta.getFecha(), nanosecond 0 zoneoff.UTC)
//si utilizamos long sumamos 3600 segundos que son una hora debido a que normalmente nos da otra franja horaria.


}
