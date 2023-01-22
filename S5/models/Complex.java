package S5.models;

public class Complex {

    private double real;
    private double imagine;

    public Complex(double real, double imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    public double getReal() {
        return real;
    }

    public double getImagine() {
        return imagine;
    }

    @Override
    public String toString() {
        if(imagine < 0)
            return real + "" +  imagine + "i";
        return real + "+" + imagine + "i";
    }

}
