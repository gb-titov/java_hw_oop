package S5.models;

public class MenuOption<T> {
    
    private T option;
    private String description;

    public MenuOption(T option, String description) {
        this.option = option;
        this.description = description;
        
    }

    public T getOption(){
        return option;
    }
    public String getDescription(){
        return description;
    }
}
