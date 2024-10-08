import datos.Persona;

import java.util.Scanner;


public class App{
    public static void main(String[] args )throws Exception{
        Scanner scan =  new Scanner (System.in);

       

        Persona p1= new Persona ();

        System.out.println("Introduce el nombre: ");
        p1.setNombre(scan.nextLine());
        System.out.println("Introduce la altura: ");
        p1.setAltura(scan.nextFloat());
        System.out.println("Introduce el peso: ");
        p1.setPeso(scan.nextFloat());


        scan.nextLine();

        Persona p2 = new Persona();

        System.out.println("Introduce el nombre: ");
        p2.setNombre(scan.nextLine());
        System.out.println("Introduce la altura: ");
        p2.setAltura(scan.nextFloat());
        System.out.println("Introduce el peso: ");
        p2.setPeso(scan.nextFloat());

        scan.nextLine();
        
        Persona p3 = new Persona();

        System.out.println("Introduce el nombre: ");
        p3.setNombre(scan.nextLine());
        System.out.println("Introduce el nombre: ");
        p3.setAltura(scan.nextFloat());
        System.out.println("Introduce el peso: ");
        p3.setPeso(scan.nextFloat());

        Persona alto=p1;
        Persona pesado=p1;

        if(p2.getAltura()>alto.getAltura()){

            alto=p2;
        }

        if(p3.getAltura()>alto.getAltura()){

            alto= p3;

        }


        if(p2.getPeso()>pesado.getPeso()){

            pesado=p2;
        }

        if(p3.getPeso()>pesado.getPeso()){

            pesado= p3;

        }

        System.out.println("El mas alto es:"+alto.getNombre());
        System.out.println("El mas pesado es:"+pesado.getNombre());
        
        System.out.println("El IMC de "+p1.getNombre()+" es "+p1.calcularIMC());
        System.out.println("El IMC de "+p2.getNombre()+" es "+p2.calcularIMC());
        System.out.println("El IMC de "+p3.getNombre()+" es "+p3.calcularIMC());


        scan.close();

    }

}
