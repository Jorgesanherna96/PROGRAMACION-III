package controller;

import view.*;
import model.*;;

public class Controller {

    Model model;
    View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setController(this);

    }

    





}