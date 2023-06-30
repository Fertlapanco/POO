package poo11;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class POO11 {
    //FileNotFoundException (Archivo no encontrado):
  public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("archivo.txt"); // Intenta abrir un archivo inexistente
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
            //e.printStackTrace();
        }
    }
}
