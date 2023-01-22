package S5;

import java.io.IOException;

import S5.controllers.App;

public class Main {
    public static void main(String[] args) {
        try {
            new App().run();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
