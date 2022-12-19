package S1.Models;

public class Person {
    public String fullName;
    public int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void openFurniture(Furniture f){
        f.open();
    }

    public void closeFurniture(Furniture f){
        f.close();
    }


    @Override
    public String toString() {
        return "Имя: " + fullName + " Возраст: "  + age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.getClass() != obj.getClass())
            return false;

        var ins = (Person)obj;
        return ins.fullName == this.fullName && ins.age == this.age;
    }
}
