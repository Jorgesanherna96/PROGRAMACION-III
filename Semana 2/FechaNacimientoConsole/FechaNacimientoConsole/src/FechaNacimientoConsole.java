
import java.io.Console;


public class FechaNacimientoConsole{
    public static void main(String[] args) throws Exception {
        Console cons=System.console();  
       
    

    String imput1= cons.readLine("Introduce en que año naciste: ");
    int num1 = Integer.parseInt(imput1);


    String imput2= cons.readLine("Introduce el año actual ");
    int num2 = Integer.parseInt(imput2);

    int suma =num2 -  num1;

    cons.printf("Hola %s",suma);





    }


}
