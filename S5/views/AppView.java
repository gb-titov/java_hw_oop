package S5.views;

import java.util.List;

import S5.controllers.App;
import S5.models.MenuOption;

public class AppView<T> {
    
    public MenuOption<T> showMenu(String header, List<MenuOption<T>> list){
        App.Log.info(header);
        System.out.println(header);
        

        for(int i = 0; i < list.size(); i++){
            System.out.println((i+1) + " - " + list.get(i).getDescription());
        }

        var choose = App.in.nextInt();

        return list.get(choose - 1);
    }
}
