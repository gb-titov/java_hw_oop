package S5;


import S5.controllers.App;

public class Main {
    public static void main(String[] args) {
        try {
            new App().run();
        } catch (Exception e) {
            App.Log.severe(e.toString());
            e.printStackTrace();
        }
    }
}
