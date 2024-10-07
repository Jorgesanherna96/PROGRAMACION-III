import datos.Persona;

import java.util.Scanner;


public class App{
    public static void main(String[] args )throws Exception{
        Scanner scan =  new Scanner (System.in);

        String nombre; float peso,altura;

        Persona p1= new Persona ();

        System.out.println("Introduce el nombre: ");
        p1.setNombre(scan.nextLine());
        System.out.println("Introduce la altura: ");
        p1.setAltura(scan.nextFloat());
        System.out.println("Introduce el peso: ");
        p1.setPeso(scan.nextFloat());

        Persona p2 = new Persona();

        System.out.println("Introduce el nombre: ");
        p1.setNombre(scan.nextLine());
        System.out.println("Introduce el nombre: ");
        p2.setAltura(scan.nextFloat());
        System.out.println("Introduce el peso: ");
        p1.setPeso(scan.nextFloat());

        
        Persona p3 = new Persona();

        System.out.println("Introduce el nombre: ");
        p3.setNombre(scan.nextLine());
        System.out.println("Introduce el nombre: ");
        p3.setAltura(scan.nextFloat());
        System.out.println("Introduce el peso: ");
        p3.setPeso(scan.nextFloat());

        



        







    }

}
