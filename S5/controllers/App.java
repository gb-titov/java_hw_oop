package S5.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.*;
import S5.models.*;
import S5.views.AppView;

public class App {

    public static Scanner in = new Scanner(System.in);
    public static Logger Log = Logger.getLogger("CalcLog");

    public App() throws SecurityException, IOException {
        var fh = new FileHandler("log.txt",true);
        Log.addHandler(fh);
        var sf = new SimpleFormatter();
        fh.setFormatter(sf);
    }

    

    public void run(){
        
        var operation = new AppView<Operation>().showMenu("Выберите действие", fillOperationMenu());

        var ctrl = new AppView<BaseNumberTypeController>().showMenu("Выберите тип чисел", fillNumberTypeMenu());

        try {
            ctrl.getOption().run(operation.getOption());
        } catch (Exception e) {
            Log.log(Level.SEVERE,e.toString());
        }
        in.close();
    
    }


    private List<MenuOption<Operation>> fillOperationMenu(){
        List<MenuOption<Operation>> list = new ArrayList<MenuOption<Operation>>();
        list.add(new MenuOption<Operation>(Operation.addition, "Сложение"));
        list.add(new MenuOption<Operation>(Operation.subtraction, "Вычитание"));
        list.add(new MenuOption<Operation>(Operation.multiplication, "Умножение"));
        list.add(new MenuOption<Operation>(Operation.division, "Деление"));
        return list;
    }

    private List<MenuOption<BaseNumberTypeController>> fillNumberTypeMenu(){
        List<MenuOption<BaseNumberTypeController>> list = new  ArrayList<MenuOption<BaseNumberTypeController>>();
        list.add(new MenuOption<BaseNumberTypeController>(new ComplexController(), "Комплексные"));
        list.add(new MenuOption<BaseNumberTypeController>(new RationalController(), "Рациональные"));
        return list;
    }
    
}
