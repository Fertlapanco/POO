package poo10;
import java.io.FileInputStream;
import java.io.IOException;
public class POO10 {
    //IOException (Excepción de entrada/salida):
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("archivo.txt"); // Intenta abrir un archivo inexistente
        } catch (IOException e) {
            System.out.println("Error: Error de entrada/salida.");
            //e.printStackTrace();
        }
    }
}