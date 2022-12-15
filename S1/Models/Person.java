package S1.Models;

public class Person {
    public String fullName;
    public int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя: " + fullName + " Возраст: "  + age;
    }
}
