package S5.services;

import S5.models.Rational;

public class RationalService extends BaseService<Rational> {


    private Rational first;
    private Rational second;



    public RationalService(Rational first, Rational second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Rational addition() {
        toCommon();
        return new Rational(first.getM() + second.getM(), first.getN());

    }

    @Override
    public Rational subtraction() {
        toCommon();
        return new Rational(first.getM() - second.getM(), first.getN());

    }

    @Override
    public Rational multiplication() {
        return new Rational(first.getM() * second.getM(), first.getN() * second.getN());
    }

    @Override
    public Rational division() {
        return new Rational(first.getM() * second.getN(), first.getN() * second.getM());
    }
    
    private void toCommon(){
        if(second.getN() == first.getN())
            return;
        var f = first.getN();
        first.multiply(second.getN());
        second.multiply(f);
    }

}
