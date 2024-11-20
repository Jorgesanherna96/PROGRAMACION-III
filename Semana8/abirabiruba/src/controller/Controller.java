package controller;

import java.util.ArrayList;

import model.Partido;
import model.QuinielaModel;
import view.View;

public class Controller {

    View v;
    QuinielaModel m;


    public Controller(View v, QuinielaModel m) {
        this.v = v;
        this.m = m;
        v.setController(this);
    }


    public void init() {


        //Inicializar la aplicacion
        if(m.cargarPartidosDeFichero()){
            v.showMessage("Leido el fichero correctamente");

        }else{
            v.showErrorMessage("Error al leer el fichero");
        }


        // MOstrar el menu al usuario (pedir a la vista)
        v.showMainMenu();


        // Finalizará ordenadamente la aplicación
    }


    public boolean cargarPartidosDeFichero() {
        return m.cargarPartidosDeFichero();
    }


    public ArrayList<Partido> getPartidos() {
        return m.getPartidos();
    }


    public void setPartidos(ArrayList<Partido> partidos) {
        //
        m.setPartidos(partidos);
    }

    
}
