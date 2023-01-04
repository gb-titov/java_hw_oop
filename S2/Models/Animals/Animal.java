package S2.Models.Animals;

import java.util.concurrent.TimeUnit;

public abstract class Animal implements IAnimal {
    
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public void feed(){
        System.out.println("Animal is eating...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Animal has eaten.");
    }


    public void move(){
        System.out.println("Animal is moving...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Animal has moved.");
    }

}
