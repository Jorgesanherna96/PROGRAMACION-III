

import static com.coti.tools.Esdia.*;


public class App {

    private static Coche[] coches= new Coche[10];
    private static  int idActual=1;
    private  static int contadorCoches=0;

    public static void main (String[] args) throws Exception {
       
        int opcion;
        do {
           System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Agregar Coche");
            System.out.println("2.  Eliminar Coche");
            System.out.println("3. Modificar Coche");
            System.out.println("4. Listar Coches");
            System.out.println("5. Salir");
            opcion = readInt("Ingrese una opción: ");

            switch (opcion) {
                case 1: agregarCoche(); break;
                case 2:  listarCoches(); break;
                case 3:  modificarCoche(); break;
                case 4:  eliminarCoche(); break;
                case 5:  System.out.println("¡Hasta luego!");;break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    private static  void agregarCoche(){
        if (contadorCoches >= coches.length) {
            System.out.println("El concesionario está lleno.");
            return;
        }

        String marca = readString("Introduce la marca del coche: ");
        String modelo = readString("Introduce el modelo del coche: ");
        coches[contadorCoches++] = new Coche(idActual++, marca, modelo);
       System.out.println("Coche agregado.");
    }


    private static  void eliminarCoche() {
        int id = readInt("Introduce el ID del coche a eliminar: ");
        

        for (int i = 0; i < contadorCoches; i++) {
            if (coches[i].getId()==id) {

                for (int j=i;  j < contadorCoches-1; j++) 
                    coches[j]=coches[j+1];
                contadorCoches--;
                System.out.println("Coche eliminado correctamente.");
                return;
            }
        }
        System.out.println("Coche no encontrado.");

    }

    public static void modificarCoche(){
        int id = readInt("Ingrese la matricula del coche a modificar: ");
        for (int i =0; i< contadorCoches;i++){
            if (coches[i].getId()==id) {
                String modelo = readString("Ingrese el nuevo modelo del coche: ");
                String marca = readString("Ingrese la nueva marca del coche: ");
                coches[i].setModelo(modelo);
                coches[i].setMarca(marca);
                
               
                System.out.println("Coche modificado correctamente.");
                return;
            }
        }
        System.out.println("Coche no encontrado");
    }


    public static void listarCoches(){
        if (contadorCoches==0) {
            System.out.println("No hay coches en el array");
            return;
        }
        for(int i=0;i<contadorCoches;i++){
            System.out.println(coches[i].ficha());
        }

    }
}



    

