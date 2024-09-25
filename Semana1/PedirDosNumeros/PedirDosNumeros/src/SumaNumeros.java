import java.util.Scanner;



public class SumaNumeros {
    public static void main(String[] args) throws Exception {
        
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el primer número: ");
    int num1= sc.nextInt();

    System.out.print("Introduce el segundo número: ");
    int num2= sc.nextInt();

    int suma= num1+ num2;
    
    System.out.println("La suma de ambos numeros es: "+suma);
    sc.close();
    }
}
