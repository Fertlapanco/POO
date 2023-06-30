package poo6;
//ArrayIndexOutOfBoundsException (Índice de matriz fuera de rango):
public class POO6 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        
        try {
            System.out.println(array[3]); // Intenta acceder a un índice fuera del rango del array
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice de matriz fuera de rango.");
            e.printStackTrace();
        }
    }
}