package view;
import controller.*;

import java.util.Scanner;

public class View {

Controller controller;

public void setController(Controller controller){

    this.controller=controller;

}

public void mostrarMenu(){
    Scanner scanner =new Scanner(System.in);
    
    int opcion=0;
do{
    System.out.println("MENU:");
    System.out.println("1) Proporcionar valor minimo de factura");
    System.out.println("2) Listar facturas: ");
    System.out.println("3) Exportar a un archivo CSV");
    System.out.println("0) Salir");
        try{
            opcion=Integer.parseInt(scanner.nextLine());
        }
        catch(Exception e){
            System.err.println("Valor Incorrecto");
        }

    switch(opcion){
        case 1: 
        
        
        break;
        case 2:
        
        break;
        case 3: 
        
        break;
        default: 



        scanner.close();
    }




}while(opcion!=0);



}
}
