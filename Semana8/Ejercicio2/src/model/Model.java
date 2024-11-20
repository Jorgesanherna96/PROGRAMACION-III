package model;
import java.util.*;

import java.io.File;
import java.nio.*;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Model {
    
    ArrayList<Factura>Facturas;


    public Factura MetodoFactorial(){
        char delimitador='\t';
        Path path= Paths.get(System.getProperty("User.Home"),"Desktop","DATOS","Facturas.tsv");

        File fileref= path.toFile();

        



    }



}
