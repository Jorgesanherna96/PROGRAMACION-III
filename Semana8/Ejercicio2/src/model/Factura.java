package model;

import java.util.Locale;

public class Factura {
    String concepto;
    double descuento;
    String fecha;
    double importe;
    String nif;
    String nombre;
    String direccion;
    final double iva=0.21f;

    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public double getImporte() {
        return importe;
    }
    public void setImporte(double importe) {
        this.importe = importe;
    }
    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
    public double ValorMinimoFactura(){

        return this.importe*(1-this.descuento)*(1+this.iva);


    }


    public Factura(String concepto, double descuento, String fecha, double importe, String nif, String nombre,
            String direccion) {
        this.concepto = concepto;
        this.descuento = descuento;
        this.fecha = fecha;
        this.importe = importe;
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
      
    


    
}
    public static Factura getFacturaFromDelimitedString(String line, String delimitador) {
        String[] trozos= line.split(delimitador);
        if(trozos.length!=8){

            return null;
        }


        try{
        return new Factura(trozos[0],Double.parseDouble(trozos[1]),trozos[2],Double.parseDouble(trozos[3]),trozos[4],trozos[5],trozos[6]);
        }
        catch(Exception e){

            return null;
        }

   




        
    }
    
    

    public String getInstanceAsDelimitedString(String delimitador){
        
        return String.format(Locale.ENGLISH, 
        "%s" + delimitador + "%.2f" + delimitador + "%s" + delimitador + "%.2f" + delimitador + "%s" + delimitador + "%s" + delimitador + "%s" + delimitador + "%.2f",
        concepto, descuento, fecha, importe, nif, nombre, direccion, iva);

        
    }
   
    
    
    
}