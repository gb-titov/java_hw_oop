package S5.views;

import S5.controllers.App;
import S5.models.Complex;

public class ComplexView {
    
    public Complex inputNum(){
        System.out.print("Введите действительную часть числа: ");
        var real = App.in.nextDouble();
        System.out.print("Введите мнимую часть числа: ");
        var img = App.in.nextDouble();
        return new Complex(real, img);
    }
    
    public void writeHeader(String msg){
        System.out.println(msg);
    }
}
