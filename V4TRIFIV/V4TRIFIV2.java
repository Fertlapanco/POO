package funciones;
public class funcionMultiplo {
     public String retornaMultiplo(int num){
    //Proceso de Datos
        if(num%3==0 && num%5==0){return "TRIFIV";}
        else if(num%5==0){return "FIV";}
        else if(num%3==0){return "TRI";}
        else return "ningun valor";
    }
}
