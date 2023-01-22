package S5.services;

import S5.models.Complex;

public class ComplexService extends BaseService<Complex> {
    private Complex first;
    private Complex second;

    public ComplexService(Complex first, Complex second) {
        this.first = first;
        this.second = second;
    }
    
    @Override
    public Complex addition(){
        var real = first.getReal() + second.getReal();
        var img = first.getImagine() + second.getImagine();
        return new Complex(real, img);
    }
    @Override
    public Complex subtraction(){
        var real = first.getReal() - second.getReal();
        var img = first.getImagine() - second.getImagine();
        return new Complex(real, img);
    }
    @Override
    public Complex multiplication(){
        var real = (first.getReal()*second.getReal() - first.getImagine()*second.getImagine());
        var img = (first.getReal() * second.getImagine() + first.getImagine() * second.getReal());
        return new Complex(real, img);
    }
    @Override
    public Complex division(){
        var real = (first.getReal()*second.getReal() + first.getImagine()*second.getImagine()) 
        / (second.getReal()*second.getReal() + second.getImagine()*second.getImagine());

        var img = (second.getReal()*first.getImagine() - first.getReal()*second.getImagine())
        / (second.getReal()*second.getReal()+second.getImagine()*second.getImagine());

        return new Complex(real, img); 
    }

}
