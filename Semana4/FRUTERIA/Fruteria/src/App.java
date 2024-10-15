
import java.util.Scanner;

import  datos.Fruta;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner hectorlector = new Scanner (System.in);

        Fruta[] frutas =new Fruta[2];


        System.out.println("Introduzca el precio el kilo de las manazanas: ");
        Double precioM = Double.parseDouble(hectorlector.nextLine());
        frutas[0]=new Fruta("Manzanas", precioM);

        System.out.println("Introduzca el precio el kilo de las Peras: ");
        Double precioP = Double.parseDouble(hectorlector.nextLine());
        frutas[1]=new Fruta("Peras", precioP);

        int cliente =0;

        boolean continuar=true;

        while(continuar){

            cliente++;
            System.out.println("\n---Cliente #"+cliente+"---");

            for(Fruta fruta : frutas){

                System.out.println("Introduce la cantidad de "+fruta.getNombre() + " en kg: ");
                fruta.setCantidadKg(hectorlector.nextDouble());
            }

            double totalCompra = 0 ;
            System.out.println("\n--- Factura para el cliente # "+cliente+ "---");
            System.out.printf("%-10s %-15s %-15s %-15s\n", "Fruta", "Cantidad (Kg)", "Precio/KG con IVA", "Precio Total");
        

        for(Fruta fruta : frutas ){
            double totalFruta =fruta.CalcularPrecioTotal();
            totalCompra += totalFruta;
            System.out.printf("%-10s %-15.2f %-15.2f %-15.2f\n", fruta.getNombre(), fruta.getCantidadKg(), fruta.getPrecioKgConIva(), totalFruta);
        }
        System.out.printf("\nTotal de la compra: %.2f €\n", totalCompra);

        System.out.println("\n¿Otro? (s/n): ");
        hectorlector.nextLine();
        String respuesta = hectorlector.nextLine();
        
        if (!respuesta.equalsIgnoreCase("s")) {
            continuar = false;
        }
    }
    hectorlector.close();

        }
    }
        




