package S5.controllers;
import javax.naming.OperationNotSupportedException;

import S5.models.Operation;
import S5.models.Rational;
import S5.services.RationalService;
import S5.views.RationalView;

public class RationalController {
    private RationalView view = new RationalView();
    private Operation op;
    private Rational first, second;

    public RationalController(Operation op) {
        this.op = op;
    }

    public void run() throws OperationNotSupportedException{
        view.writeHeader("Введите первое число:");
        first = view.inputNum();
        view.writeHeader("Введите второе число:");
        second = view.inputNum();
        doOperation();
    }

    private void doOperation() throws OperationNotSupportedException{
        var srv = new RationalService(first, second);
        Rational result;
        switch (op) {
            case addition:
                result = srv.addition();
                break;
            case subtraction:
                result = srv.subtraction();
                break;
            case multiplication:
                result = srv.multiplication();
                break;
            case division:
                result = srv.division();
                break;
            default:
                throw new OperationNotSupportedException("Неверный тип операции");
        }

        view.writeHeader("Результат: " + result.toString());
    }
}
