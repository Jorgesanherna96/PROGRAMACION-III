package controller;

import view.*;
import model.*;
import java.util.*;

public class Controller {

    Model model;
    View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setController(this);

    }


    public boolean CargarFacturas() {
        return  model.MetodoFactorial();
    }


    public ArrayList<Factura> getFacturas(){

     

        return model.getFacturas();


    }

    public static String getCabeceratabla(){

    
        return String.format("| %20s | %10s | %10s | %10s | %20s | %20s | %20s |",
                "Concepto", "Descuento", "Fecha", "Importe", "NIF", "Nombre", "Dirección");
    

}




    public static String getTabla(Factura factura) {

        return Model.getTabla( factura);

    }


    public static List<String>FacturasSuperiores (double importe){
       
        return Model.FacturasSuperiores(importe);



    }
  
    public static boolean exportarDelimitado(String delimitador){

        return Model.exportarDelimitado(delimitador);
    }




}
