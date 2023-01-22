package S5.views;

import S5.controllers.App;
import S5.models.Rational;

public class RationalView {
    
    public Rational inputNum(){
        System.out.print("Введите числитель: ");
        var m = App.in.nextInt();
        System.out.print("Введите знаменатель: ");
        var n = App.in.nextInt();
        return new Rational(m, n);
    }
    
    public void writeHeader(String msg){
        System.out.println(msg);
    }
}
