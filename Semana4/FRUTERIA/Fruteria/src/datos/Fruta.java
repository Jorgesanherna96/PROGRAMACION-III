package datos;

public class Fruta {

        private String nombre;
        private double PrecioKg;
        private double CantidadKg;
        private static final  double IVA=0.21;
      
      
        public Fruta(String nombre, double precioKg, double cantidadKg) {
            this.nombre = nombre;
            this.PrecioKg = precioKg;
            this.CantidadKg = cantidadKg;
        }

        


        public Fruta(String nombre, double precioKg) {
            this.nombre = nombre;
            this.PrecioKg = precioKg;
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


        public void setPrecioKg(double precioKg) {
            PrecioKg = precioKg;
        }


        public void setCantidadKg(double cantidadKg) {
            CantidadKg = cantidadKg;
        }


        public double getPrecioKgConIva(){

            return PrecioKg*(1+IVA);
        }
        
        public double CalcularPrecioTotal(){

            return CantidadKg*getPrecioKgConIva();
        }
        

        


        
}
