package S3;

import S3.Abilities.PetAbility;
import S3.Models.PersonsRelation;
import S3.Models.Animals.Cat;
import S3.Models.Furnitures.Cupboard;
import S3.Models.Furnitures.Furniture;
import S3.Models.Humans.Person;
import S3.Models.Humans.PersonWithPet;
import S3.Researches.AgeResearch;
import S3.Researches.RelativeResearch;

public class Main {

    public static IGeoTree tree;
    public static void main(String[] args) {
        fillGeoTree();
        var person = tree.getTree().get(2).getMainPerson();
        System.out.println("Ищем детей для {"+ person +"}");
        findChildren(person);

        int age = 35;
        System.out.println("Ищем людей старше " + age);
        findOlders(age);


        Furniture furniture = new Cupboard();

        openFurniture(person, furniture);
        openFurniture(person, furniture);
        
        doWithPet();
    }


    private static void doWithPet() {
        PersonWithPet p = new PersonWithPet("Иванов Иван Иванович", 30, new Cat("Пушок"), new PetAbility());
        p.feedPet();
        p.walkWithPet();                                                                                         
    }


    private static void openFurniture(Person p, Furniture f){
        try {
            System.out.println("Человек открывает мебель...");
            p.openFurniture(f);
            System.out.println("Человек открыл мебель.");
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }
    }

    private static void findOlders(int age) {
        AgeResearch r = new AgeResearch(tree);
        var olders = r.findOlderThan(age);
        if(olders.size() == 0){
            System.out.println("Люди не найдены.");
            return;
        }

        for (PersonsRelation personsRelation : olders) {
            
            System.out.println(personsRelation.getMainPerson());
        }

    }

    public static void findChildren(Person person){
        RelativeResearch rel = new RelativeResearch(tree);
        var rels = rel.findChildren(person);

        if(rels.size() == 0){
            System.out.println("Дети не найдены.");
            return;
        }
            
        for (PersonsRelation personsRelation : rels) {
            System.out.println(personsRelation.getPersonRelationShip());
        }
    }

    public static void fillGeoTree(){
        tree = new GeoTree();
        tree.addChildrenToParent(new Person("Иванов Иван Иванович", 31), new Person("Иванов Петр Иванович", 10));
        tree.addChildrenToParent(new Person("Иванова Анна Петровна", 31), new Person("Иванов Петр Иванович", 10));
        tree.addChildrenToParent(new Person("Петров Петр Петрович", 45), new Person("Петров Иван Петрович", 15));
        tree.addChildrenToParent(new Person("Петров Петр Петрович", 45), new Person("Петрова Елена Петровна", 20));
    }
}
