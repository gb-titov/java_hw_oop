package S2.Abilities;

import S2.Models.Animals.Animal;

public interface Feedable {
    <T extends Animal> void feed(T pet);
}
