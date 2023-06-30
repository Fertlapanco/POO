package poo;
//ejercicio 1 26-06-2023
import javax.swing.JOptionPane;
public class POO {
    public static void main(String[] args) {
        int x,y;
        try {
             x= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numeo  1","Solicite datos",3));
        }catch(NumberFormatException n){
            System.out.println(n.getMessage()+  "No es un numero entero");
        }
          
    }  
}
