package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
            System.out.println("Error al obtener la lista de productos: " + e.getMessage());
        }

        return lista;
    }


    public List buscarProductoReferencia(String ListaProductos){
        List lista = new LinkedList<>();

        String getProductoReferencia = "SELECT * FROM producto WHERE referencia = ?";

        try (Connection connection = SQLDataBaseManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(getProductoReferencia);) {
            statement.setString(1, ListaProductos);
            ResultSet resultSet = statement.executeQuery();


            while (resultSet.next()) {

                String referencia = resultSet.getNString("referencia");
                int id = resultSet.getInt("id");
                int tipo = resultSet.getInt("tipo_id");
                String nombre = resultSet.getNString("nombre");
                String descrpcion = resultSet.getNString("descripcion");
                Double precio = resultSet.getDouble("precio");
                int cantidad = resultSet.getInt("cantidad");
                int descuento = resultSet.getInt("descuento");
                int iva = resultSet.getInt("iva");
                boolean aplicar_dto = resultSet.getBoolean("tipo_id");

                Producto c1 =  new Producto(referencia, id, tipo, nombre, descrpcion, precio, cantidad, descuento, iva, aplicar_dto);
                lista.add(c1);

            }

        } catch (Exception e) {
            System.out.println("Error al obtener la lista de productos: " + e.getMessage());
        }
        return lista;
    }

    public List buscarProductocantidad(int ListaProductos){
        List<Producto> productos = new LinkedList<>();

        String getProductoCantidad = "SELECT * FROM producto WHERE cantidad = ?";

        try (Connection connection = SQLDataBaseManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(getProductoCantidad);) {
            statement.setInt(1, ListaProductos);
            ResultSet resultSet = statement.executeQuery();


            while (resultSet.next()) {

                String referencia = resultSet.getNString(2);
                int id = resultSet.getInt(1);
                int tipo_id = resultSet.getInt(10);
                String nombre = resultSet.getNString(3);
                String descrpcion = resultSet.getNString(4);
                Double precio = resultSet.getDouble(6);
                int cantidad = resultSet.getInt(5);
                int descuento = resultSet.getInt(7);
                int iva = resultSet.getInt(8);
                boolean aplicar_dto = resultSet.getBoolean(9);

                Producto c1 =  new Producto(referencia, id, tipo_id, nombre, descrpcion, precio, cantidad, descuento, iva, aplicar_dto);
                productos.add(c1);

            }

        } catch (Exception e) {
            System.out.println("Error al obtener la lista de productos: " + e.getMessage());
        }
        return productos;
    }

    public int insertarProducto(Producto producto) {
        int responses = -1;

        String insertarUnProducto = "INSERT INTO producto (referencia, nombre, descripcion, cantidad, precio, descuento, iva, aplicar_dto, tipo_id) \n" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try (Connection connection = SQLDataBaseManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(insertarUnProducto);) {




            statement.setString(1,producto.getReferencia());
            statement.setString(2,producto.getNombre());
            statement.setString(3,producto.getDescripcion());
            statement.setDouble(4,producto.getCantidad());
            statement.setDouble(5,producto.getPrecio());
            statement.setInt(6,producto.getDescuento());
            statement.setInt(7,producto.getIva());
            statement.setBoolean(8,producto.isAplicar_dto());
            statement.setInt(9,producto.getTipo());




            responses = statement.executeUpdate();



        } catch (Exception e) {
            System.out.println("Error al obtener la lista de productos: " + e.getMessage());
        }
        return responses;
    }

    public List buscarProductoTipo(int ListaProductos){
        List<Producto> productos = new LinkedList<>();

        String getProductoCantidad = "SELECT * FROM producto WHERE tipo_id = ?";

        try (Connection connection = SQLDataBaseManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(getProductoCantidad);) {
            statement.setInt(1, ListaProductos);
            ResultSet resultSet = statement.executeQuery();


            while (resultSet.next()) {

                String referencia = resultSet.getNString(2);
                int id = resultSet.getInt(1);
                int tipo_id = resultSet.getInt(10);
                String nombre = resultSet.getNString(3);
                String descrpcion = resultSet.getNString(4);
                Double precio = resultSet.getDouble(6);
                int cantidad = resultSet.getInt(5);
                int descuento = resultSet.getInt(7);
                int iva = resultSet.getInt(8);
                boolean aplicar_dto = resultSet.getBoolean(9);

                Producto c1 =  new Producto(referencia, id, tipo_id, nombre, descrpcion, precio, cantidad, descuento, iva, aplicar_dto);
                productos.add(c1);

            }

        } catch (Exception e) {
            System.out.println("Error al obtener la lista de productos: " + e.getMessage());
        }
        return productos;
    }


    public int  eliminarProductoReferencia(String referencia){
        int responses = -1;

        String eliminarProductosReferencia = "DELETE FROM producto WHERE referencia = ?";

        try (Connection connection = SQLDataBaseManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(eliminarProductosReferencia);) {


                statement.setString(1, referencia);

                responses = statement.executeUpdate();




        } catch (Exception e) {
            System.out.println("Error al obtener la lista de productos: " + e.getMessage());
        }
        return responses;
    }

    public int insertarTipo(Tipo tipo) {

        int responses = -1;

        String insertaruntipo = "INSERT INTO tipo (nombre) \n" +
                "VALUES (?);";

        try (Connection connection = SQLDataBaseManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(insertaruntipo);) {

            statement.setString(2,tipo.getNombre());

            responses = statement.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error al obtener la lista de tipos: " + e.getMessage());
        }
        return responses;
    }

    public int actualizarProducto(Producto producto) {
        int response = -1;
        String sql = "UPDATE Inventario set Descripcion = ?, Cantidad = ?, Precio = ?, Descuento = ?, AplicarDto = ? WHERE Referencia = ?";
        try(Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement3 = connection.prepareStatement(sql);){

            statement3.setNString(1, producto.getDescripcion());
            statement3.setInt(2,producto.getCantidad());
            statement3.setDouble(3,producto.getPrecio());
            statement3.setDouble(4,producto.getDescuento());
            statement3.setBoolean(5,producto.isAplicar_dto());
            statement3.setNString(6, producto.getReferencia());

            statement3.executeUpdate();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return response;
    }


}
