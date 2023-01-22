package S5.controllers;

import javax.naming.OperationNotSupportedException;

import S5.models.Operation;

public abstract class BaseNumberTypeController {

    public abstract void run(Operation op) throws OperationNotSupportedException;
}
