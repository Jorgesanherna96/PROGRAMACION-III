package model;
import java.util.*;
import java.nio.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.*;

public class Model {
    
   public static  ArrayList<Factura>facturas;


    public boolean MetodoFactorial(){
        String delimitador="\t";
        Path path= Paths.get(System.getProperty("user.home"),"Desktop","DATOS","Facturas.tsv");

        File fileref= path.toFile();

        if(fileref.exists()&&fileref.isFile()){
          
        ArrayList<Factura>facturas2=new ArrayList<>();

        List<String> lista = new ArrayList<>();
            
       
    

        try{

            lista= Files.readAllLines(path,StandardCharsets.UTF_8); 

            for(String line:lista){

                Factura factura= Factura.getFacturaFromDelimitedString(line,delimitador);

                if(factura!=null){
                    facturas2.add(factura);
                }


            }

           
        }
        catch(IOException e){
        return false;
        
        }
        
        
        this.facturas=facturas2;


        return true;
    }
        else{
            return false;
        }
 

}


    public ArrayList<Factura> getFacturas() {
      return facturas;
    }



        public static String getTabla(Factura factura) {
          
            return String.format(
                    "| %20.20s | %10.2f | %10.10s | %10.2f | %20.20s | %20.20s | %20.20s |",
                    factura.concepto,         // Concepto (truncado si es muy largo)
                    factura.descuento,        // Descuento (2 decimales)
                    factura.fecha,            // Fecha
                    factura.importe,          // Importe (2 decimales)
                    factura.nif,              // NIF (truncado si es muy largo)
                    factura.nombre,           // Nombre (truncado si es muy largo)
                    factura.direccion         // Dirección (truncado si es muy largo)
            );
        
        }


     public static  List<String> FacturasSuperiores(double importe){

        List<String>Superiores= new ArrayList<>();

        for(Factura factura:facturas) {
           
            if(factura.ValorMinimoFactura()>importe){
                System.out.println(factura.ValorMinimoFactura());
                    Superiores.add(factura.getNombre());

            }
        }

        return Superiores;

    }

    
     public static boolean exportarDelimitado(String delimitador){

        Path path= Paths.get(System.getProperty("user.home"),"Desktop","DATOS","Facturas.csv");

        File fileref= path.toFile();

        if(fileref.exists()&&fileref.isFile()){

            ArrayList<String> lineas = new ArrayList<>();
            
             for (Factura factura : facturas) {
            lineas.add(factura.getInstanceAsDelimitedString(delimitador));
                }
        
                try{
                    Files.write(path, lineas, StandardCharsets.UTF_8);
                 System.out.println("Datos exportados exitosamente a: " + path.toFile().getAbsolutePath());


                }
                catch(IOException e){
                    return false;

                }


                return true;
     }

            return false;

     }
    }
       

