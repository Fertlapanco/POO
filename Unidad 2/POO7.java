package poo7;
//ClassCastException (Excepción de conversión de clase):
public class POO7 {
    public static void main(String[] args) {
        try {
            Object obj = new Integer(10);
            String str = (String) obj; // Intenta convertir un objeto Integer en String
        } catch (ClassCastException e) {
            System.out.println("Error: No se puede convertir el objeto a la clase especificada.");
        }
        //e.printStackTrace();
    }
}