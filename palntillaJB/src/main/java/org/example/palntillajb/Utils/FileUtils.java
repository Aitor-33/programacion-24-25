package org.example.palntillajb.Utils;


import org.example.palntillajb.model.Mascota;

import java.io.*;
import java.util.LinkedList;

    public class FileUtils {
        public static void writeFile(String fileName, LinkedList<Mascota> productos) {
            try (ObjectOutputStream buffer = new ObjectOutputStream(
                    new FileOutputStream("src/main/resources/" + fileName))) {
                buffer.writeObject(productos);
                System.out.println("Productos guardados correctamente.");
            } catch (IOException e) {
                System.out.println("Error al guardar productos: " + e.getMessage());
            }
        }

        public static LinkedList<Mascota> readFile(String fileName) {
            LinkedList<Mascota> productos = new LinkedList<>();
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/" + fileName))) {
                while (true) {
                    try {
                        Object obj = ois.readObject();
                        if (obj instanceof Mascota) {
                            productos.add((Mascota) obj);
                        }
                    } catch (EOFException eof) {
                        break; // Fin del archivo
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al leer productos: " + e.getMessage());
            }
            return productos;
        }
}
