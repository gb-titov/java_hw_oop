package S3.Abilities;

import S3.Models.Animals.Animal;

public interface Feedable {
    <T extends Animal> void feed(T pet);
}
