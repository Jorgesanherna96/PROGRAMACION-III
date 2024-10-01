
import java.util.Scanner;


public class CalculoEdad{
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);

        System.out.print("Introduce tu año de nacimiento: ");
        int anioNacimiento =sc.nextInt();

        System.out.print("Introduce el año actual: ");
        int anioActual=sc.nextInt();

        int edad= anioActual-anioNacimiento;

        System.out.printf("Tu edad es : %d años. \n", edad);

        sc.close();


    }
}
