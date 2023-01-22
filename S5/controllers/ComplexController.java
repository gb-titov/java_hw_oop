package S5.controllers;

import javax.naming.OperationNotSupportedException;

import S5.models.Complex;
import S5.models.Operation;
import S5.services.ComplexService;
import S5.views.ComplexView;

public class ComplexController extends BaseNumberTypeController {
    
    private ComplexView view = new ComplexView();
    private Operation op;
    private Complex first, second;

    public void run(Operation op) throws OperationNotSupportedException{
        this.op = op;
        view.writeHeader("Введите первое число:");
        first = view.inputNum();
        view.writeHeader("Введите второе число:");
        second = view.inputNum();
        doOperation();
    }

    private void doOperation() throws OperationNotSupportedException{
        var srv = new ComplexService(first, second);
        Complex result;
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
