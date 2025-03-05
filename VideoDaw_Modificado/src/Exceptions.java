public class Exceptions {
    public class ClienteYaRegistradoException extends Exception {

        public ClienteYaRegistradoException(String mensaje) {

            super(mensaje);

        }
    }
    
    // Excepción para artículo ya alquilado
    public class ArticuloYaAlquiladoException extends Exception {

        public ArticuloYaAlquiladoException(String mensaje) {

            super(mensaje);

        }
    }
    
    // Excepción para tiempo excedido en alquiler
    public class TiempoExcedidoException extends Exception {

        public TiempoExcedidoException(String mensaje) {

            super(mensaje);
            
        }
    }
}
