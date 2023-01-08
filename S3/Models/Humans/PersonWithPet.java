package S3.Models.Humans;

import S3.Abilities.PetAbility;
import S3.Models.Animals.Animal;
import S3.Models.Animals.IAnimal;

public class PersonWithPet extends Person {
    private Animal animal;
    private PetAbility ability;

    public PersonWithPet(String fullName, int age, IAnimal animal, PetAbility ability) {
        super(fullName, age);
        this.ability = ability;
        this.animal = (Animal)animal;
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
}
