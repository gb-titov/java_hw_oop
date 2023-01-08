package S3.Abilities;

import S3.Models.Animals.Animal;

public class PetAbility implements Feedable, Walkable {

    @Override
    public <T extends Animal> void feed(T pet) {
        System.out.println("Feeding " + pet.getName());
        try {
            pet.feed();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public <T extends Animal> void walkWithPet(T pet) {
        System.out.println("Walking pet..");
        try {
            pet.move();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
