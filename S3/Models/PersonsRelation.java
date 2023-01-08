package S3.Models;

import S3.Models.Humans.Person;

public class PersonsRelation {
    private Person mainPerson;
    private Relationship relationship;
    private Person secondaryPerson;

    public PersonsRelation(Person person, Relationship rel, Person person2) {
        mainPerson = person;
        relationship = rel;
        secondaryPerson = person2;
    }

    public Person getMainPerson() {
        return mainPerson;
    }

    public Person getSecondaryPerson(){
        return secondaryPerson;
    }

    public Relationship getRelationship(){
        return relationship;
    }
    
    public String getPersonRelationShip(){
        return mainPerson.fullName + " is " + relationship + " of " + secondaryPerson.fullName;
    }
}
