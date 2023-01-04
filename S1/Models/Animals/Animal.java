package S1.Models.Animals;

import java.util.concurrent.TimeUnit;

public abstract class Animal {
    
    public void feed() throws InterruptedException{
        System.out.println("Animal is eating...");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Animal has eaten.");
    }


    public void move() throws InterruptedException{
        System.out.println("Animal is moving...");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Animal has moved.");
    }

}
