package S3.Abilities;

import S3.Models.Animals.Animal;

public interface Walkable {
    
    <T extends Animal> void walkWithPet(T pet);

}
