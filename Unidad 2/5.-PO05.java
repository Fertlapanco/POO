package po0.pkg5;
public class PO05 {
    public static int miMetodo(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();  
        }
        int c = a /b;
        return c;
    }
    public static void main(String[] args) {
        try{
            int division=miMetodo(10,2);
            System.out.println(division);
        }catch(ArithmeticException e){
            System.out.println("Execption aritmetica arrojada ");
            e.printStackTrace();
        }
    }   
}