package poo4;
//ejercicio 4 26/06/2023
public class POO4 {
    public static void main(String[] args) {
       try{
           int division = miMetodo(10,0);
           System.out.println(division);
       }catch(ArithmeticException e){
           System.out.println("Exepcion aritmetica arrojada ");
       }
    }
    public static int miMetodo(int a,int b)throws ArithmeticException {
        int c= a / b;
        return c;
    }
    
}
