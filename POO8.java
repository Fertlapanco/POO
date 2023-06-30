package poo8;
public class POO8 {
    //ClassCastException (Excepción de conversión de clase):
    public static void main(String[] args) {
        try {
            Class.forName("com.example.NonExistentClass"); // Intenta cargar una clase inexistente
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Clase no encontrada.");
            //e.printStackTrace();
        }
    }
}