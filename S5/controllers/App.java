package S5.controllers;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;
import java.util.logging.FileHandler.*;

import javax.naming.OperationNotSupportedException;
import javax.swing.text.View;

import S5.models.Operation;
import S5.views.AppView;

public class App {

    public static Scanner in = new Scanner(System.in);
    public static Logger logger = Logger.getLogger("CalcLog");
    FileHandler fh;
    SimpleFormatter sFormat;
    private AppView view;


    public App() throws SecurityException, IOException {
        fh = new FileHandler("log.txt",true);
        logger.addHandler(fh);
        sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        view = new AppView();
    }

    public void run(){
        
        var op = view.showMenu();
        var tp = view.ChooseType();
        try {
            selectCtrl(op, tp);
        } catch (OperationNotSupportedException e) {
            logger.log(Level.SEVERE,e.toString());
        }
        in.close();
    }

    private void selectCtrl(int op, int tp) throws OperationNotSupportedException {
        Operation operation; 
        switch (op) {
            case 1:
                operation = Operation.addition;
                break;
            case 2:
                operation = Operation.subtraction;
                break;    
            case 3:
                operation = Operation.multiplication;
                break;
            case 4:
                operation = Operation.division;
                break;    
            default:
                throw new OperationNotSupportedException("Неверный тип операции");
        }

        switch (tp) {
            case 1:
                new ComplexController(operation).run();
                break;
            case 2:
                new RationalController(operation).run();
                break;
        }
    }

    
}
