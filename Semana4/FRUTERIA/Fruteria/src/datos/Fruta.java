package datos;

public class Fruta {

        private String nombre;
        private float PrecioKg;
        private float CantidadKg;
        public static final double IVA=0.21;
      
      
        public Fruta(String nombre, float precioKg, float cantidadKg) {
            this.nombre = nombre;
            this.PrecioKg = precioKg;
            this.CantidadKg = cantidadKg;
        }


        public Fruta() {
            
        }


        public String getNombre() {
            return nombre;
        }


        public float getPrecioKg() {
            return PrecioKg;
        }


        public float getCantidadKg() {
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

        

        


        
}
