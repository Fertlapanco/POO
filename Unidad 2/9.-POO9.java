package poo9;
public class POO9 {
    //NullPointerException (Puntero nulo):
    public static void main(String[] args) {
        String str = null;
        
        try {
            System.out.println(str.length()); // Intenta acceder a un método de un objeto nulo
        } catch (NullPointerException e) {
            System.out.println("Error: Puntero nulo.");
            //e.printStackTrace();
        }
    }
    
}