package S3.Models.Humans;

public abstract class Human {
    public String fullName;
    public int age;

    public Human(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
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
