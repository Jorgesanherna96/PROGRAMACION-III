package view; 
import controller.*;

import java.util.*;             

import model.*;

public class View {

Controller controller;

public void setController(Controller controller){

    this.controller=controller;

}

public void mostrarMenu(){
    Scanner scanner =new Scanner(System.in);
    if(controller.CargarFacturas()){
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

        ValorMinimoFactura();
        
        
        break;
        case 2:
        mostrarFacturas();
        
        break;
        case 3: 
        String delimitador= ",";
        if(Controller.exportarDelimitado(delimitador)){
                System.out.println("Exportado correctamente");

        }
        else{
            System.out.println("Jodienda");
        }
        
        break;
        default: 



        scanner.close();
    }




}while(opcion!=0);

    }

}

public void mostrarFacturas(){

    ArrayList<Factura> facturas= controller.getFacturas();

    System.out.println(Controller.getCabeceratabla());

    for(Factura factura:facturas){
        System.out.println(Controller.getTabla(factura));
    }




}


public void ValorMinimoFactura(){

    Scanner scanner =new Scanner(System.in);

    System.out.println("Introduzca el importe(double): ");
    double importe=scanner.nextDouble();

    List<String>Superiores=controller.FacturasSuperiores(importe);
    System.out.println("Facturas superiores a "+importe+"€: ");

    for(String superiores:Superiores){

        System.out.println(superiores);

    }
   
}


}
