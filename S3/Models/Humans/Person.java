package S3.Models.Humans;

import S3.Models.Furnitures.Furniture;

public class Person extends Human {
    
    public Person(String fullName, int age) {
        super(fullName, age);
    }

    public void openFurniture(Furniture f){
        f.open();
    }

    public void closeFurniture(Furniture f){
        f.close();
    }

   
}
