import java.util.Scanner;


public class TresNum {
    public static void main(String[] args) throws Exception {
        
    Scanner Scanner= new Scanner (System.in);

    System.out.print("Introduce el primer número: ");
    int num1 = Scanner.nextInt();

    System.out.print("Introduce el segundo número: ");
    int num2 = Scanner.nextInt();
    

    System.out.print("Introduce el tercer número: ");
    int num3 = Scanner.nextInt();


    if(num1>num2){
    
        if(num1>num3){
            System.out.println("El mas grande es: "+num1);

        }
    }
    else{

        if(num2>num3){
            System.out.println("El mas grande es: "+num2);
        }
        else{
            System.out.println("El mas grande es: "+num3);
        }
    }
    

        Scanner.close();
              }
}
