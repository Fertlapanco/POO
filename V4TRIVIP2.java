package pkg5v4trifiv;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    
    public static void main(String[] args) throws IOException {
                //declaracion de variables
                BufferedReader bufEntrada=new BufferedReader(new InputStreamReader(System.in));
                int numero;
                funcionMultiplo mult=new funcionMultiplo();
                //entrada de datos
                System.out.println("dame el numero");
                numero=Integer.parseInt(bufEntrada.readLine());
                //salida de datos
                System.out.println(mult.retornaMultiplo(numero));
    }
    
}
