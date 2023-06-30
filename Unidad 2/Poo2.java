/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import javax.swing.JOptionPane;

/**
 *
 * @author ftlap
 */
public class Poo2 {


    public static void main(String[] args) {
        int x,y;
        try {
             x= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numeo  1","Solicite datos",3));
             y= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numeo  2","Solicite datos",3));
             JOptionPane.showMessageDialog(null,"La division de " + x + "/" + y + "es" + (x/y) ,"Mostrando ",1);
        }catch(NumberFormatException n){
            System.out.println(n.getMessage()+  "No es un numero entero");
        }catch(ArithmeticException a){
            System.out.println(a.getMessage()+ "No se puede dividir entre 0 ");
        }
          
    }  
}

