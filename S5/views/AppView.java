package S5.views;

import java.util.logging.Level;

import S5.controllers.App;

public class AppView {
    
    public int showMenu(){
        App.logger.log(Level.INFO, "Главное меню показано.");

        System.out.println("Выберите операцию:");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");

        return App.in.nextInt();
    }

    public int ChooseType(){
        App.logger.log(Level.INFO, "Меню выбора типа чисел показано.");
        System.out.println("Выберите тип чисел:");
        System.out.println("1 - Комплексные");
        System.out.println("2 - Рациональные");

        return App.in.nextInt();
    }


}
