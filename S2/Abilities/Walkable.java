package S2.Abilities;

import S2.Models.Animals.Animal;

public interface Walkable {
    
    <T extends Animal> void walkWithPet(T pet);

}
