package poo3;
//ejercicio 3 26/06/2023
public class POO3 {
    public static void main(String[] args) {
       try{
           float equis=5/0;
           System.out.println("Equis = "+equis);
          
       }catch(ArithmeticException e)
       {
            System.out.println("error : division entre 0 "); 
       }finally{
           System.out.println("A pesar de todo ,se ejecuta el bloque finally.");
       }      
    }
}
