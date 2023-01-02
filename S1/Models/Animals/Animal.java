import java.util.concurrent.TimeUnit;

public abstract class Animal {
    
    public void feed(){
        System.out.println("Animal is eating...");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Animal has eaten.");
    }


    public void move(){
        System.out.println("Animal is moving...");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Animal has moved.");
    }

}
