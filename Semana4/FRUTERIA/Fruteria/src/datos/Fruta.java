package datos;

public class Fruta {

        private String nombre;
        private double PrecioKg;
        private double CantidadKg;
        public static final double IVA=0.21;
      
      
        public Fruta(String nombre, float precioKg, float cantidadKg) {
            this.nombre = nombre;
            this.PrecioKg = precioKg;
            this.CantidadKg = cantidadKg;
        }

        


        public Fruta(String nombre, double precioKg) {
            this.nombre = nombre;
            PrecioKg = precioKg;
        }




        public Fruta() {
            
        }


        public String getNombre() {
            return nombre;
        }


        public double getPrecioKg() {
            return PrecioKg;
        }


        public double getCantidadKg() {
            return CantidadKg;
        }


        public void setNombre(String nombre) {
            this.nombre = nombre;
        }


        public void setPrecioKg(float precioKg) {
            PrecioKg = precioKg;
        }


        public void setCantidadKg(float cantidadKg) {
            CantidadKg = cantidadKg;
        }


        public double getPrecioKgConIva(){

            return PrecioKg*(1+IVA);
        }
        
        public double CalcularPrecioTotal(){

            return CantidadKg*getPrecioKgConIva();
        }
        

        


        
}
