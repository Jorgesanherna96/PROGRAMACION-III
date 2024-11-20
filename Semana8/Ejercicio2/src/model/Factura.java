package model;

public class Factura {
    String concepto;
    float descuento;
    String fecha;
    float importe;
    String nif;
    String nombre;
    String direccion;
    final float iva=0.21f;

    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public float getDescuento() {
        return descuento;
    }
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public float getImporte() {
        return importe;
    }
    public void setImporte(float importe) {
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
   
    public float ValorMinimoFactura(){

        return this.importe*(1-this.descuento)*this.iva;


    }


    public Factura(String concepto, float descuento, String fecha, float importe, String nif, String nombre,
            String direccion) {
        this.concepto = concepto;
        this.descuento = descuento;
        this.fecha = fecha;
        this.importe = importe;
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
      
    


    
}
}