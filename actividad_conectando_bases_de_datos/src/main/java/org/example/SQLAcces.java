package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class SQLAcces {



    public List getListaProductos() {
        List lista = new LinkedList<>();

        String getnombres = "SELECT * FROM producto";

        try (Connection connection = SQLDataBaseManager.getConnection(); Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(getnombres);) {
            while (resultSet.next()) {
                lista.add(resultSet.getString("nombre"));
            }
        } catch (Exception e) {
            System.out.println("Error al obtener la lista de personas: " + e.getMessage());
        }

        return lista;
    }


    public List buscarProductoReferencia(String referencia1){
        List lista = new LinkedList<>();

        String getProductoReferencia = "SELECT * FROM producto WHERE referencia = ?";

        try (Connection connection = SQLDataBaseManager.getConnection(); Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(getProductoReferencia);) {

            while (resultSet.next()) {

                String referencia = resultSet.getNString(1);
                int id = resultSet.getInt(2);
                int tipo = resultSet.getInt(3);
                String nombre = resultSet.getNString(7);
                String descrpcion = resultSet.getNString(8);
                Double precio = resultSet.getDouble(9);
                int cantidad = resultSet.getNString(9);
                int descuento = resultSet.getNString(9);
                int iva = resultSet.getNString(9);

                Producto c1 =  new Producto(referencia, id, tipo, nombre, descrpcion, precio, cantidad, descuento, iva);
                lista.add(c1);

            }

        } catch (Exception e) {
            System.out.println("Error al obtener la lista de personas: " + e.getMessage());
        }
        return lista;
    }
}
