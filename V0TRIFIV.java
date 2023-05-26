package primerprograma;
import java.util.Scanner;
public class PrimerPrograma {
     public static void main(String[] args) {
        Scanner ftb= new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int x = ftb.nextInt();
        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("trifiu");
        } else if (x % 3 == 0) {
            System.out.println("tri");
        } else if (x % 5 == 0) {
            System.out.println("fiu");
        }
    }
}
