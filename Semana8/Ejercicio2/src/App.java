import view.*;
import controller.*;
import model.*;

public class App {
    public static void main(String[] args) throws Exception {
      
        Model model =new Model();
        View view =new View();

        Controller controller= new Controller (model,view);

        view.mostrarMenu();
        


    }
}
