import com.coti.tools.Esdia;
import java.util.Scanner;

import  datos.Fruta;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner hectorlector = new Scanner (System.in);

        Fruta[] frutas =new Fruta[2];


        System.out.println("Introduzca el precio el kilo de las manazanas: ");
        Double precioM = Double.parseDouble(hectorlector.nextLine());
        frutas[0]=new Fruta("Manzanas", precioM);

        System.out.println("Introduzca el precio el kilo de las Peras: ");
        Double precioP = Double.parseDouble(hectorlector.nextLine());
        frutas[1]=new Fruta("Peras", precioP);

        





    }
}
