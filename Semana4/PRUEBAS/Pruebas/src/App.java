
import datos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola estoy probando argumentos");

        //args 1 = nombre
        //args 2 = dni

        Persona p1= new Persona (args[0],args[1]);

        System.out.println("Acabo de regitrar "+p1.getNombre()+ " de dni "+p1.getDni());

    }
}
