package S2.Models;

import S2.Abilities.PetAbility;
import S2.Models.Animals.Animal;
import S2.Models.Animals.IAnimal;
import S2.Models.Furnitures.Furniture;

public class Person {
    public String fullName;
    public int age;
    private Animal animal;
    private PetAbility ability;

    public Person(String fullName, int age, IAnimal animal, PetAbility ability) {
        this(fullName, age);
        this.ability = ability;
        this.animal = (Animal)animal;
    }

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

    public void feedPet(){
        if(animal != null && ability != null){
            ability.feed(animal);
            return;
        }
        System.out.println("You can't feed a pet");
    }

    public void walkWithPet(){
        if(animal != null && ability != null){
            ability.walkWithPet(animal);
            return;
        }
        System.out.println("You can't walk a pet");
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
