package S5.models;

public class Rational {
    
    private int m;
    private int n;
    
    public Rational(int m, int n) {
        if(n < 1)
            throw new ArithmeticException("Числитель не может быть меньше 1");

        this.m = m;
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public void multiply(int num){
        if(num < 1)
            throw new ArithmeticException("Множитель не может быть меньше 1");
        m *= num;
        n *= num;
    }

    @Override
    public String toString() {
        return "(" + m + " / " + n + ")";
    }
}
