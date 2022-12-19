package S1.Models;

import java.lang.invoke.WrongMethodTypeException;

public class Furniture {
    
    private Boolean isOpen = false;

    public void open(){
        if(isOpen == false)
            isOpen = true;
        else
            throw new WrongMethodTypeException("Нельзя открыть, т.к. предмет открыт.");
    }

    public void close(){
        if(isOpen == true)
            isOpen = false;
        else
            throw new WrongMethodTypeException("Нельзя закрыть, т.к. предмет закрыт.");
    }
}
