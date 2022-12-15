package S1;

import java.util.ArrayList;

import S1.Models.Person;
import S1.Models.PersonsRelation;
import S1.Models.Relationship;

public class GeoTree {
    private ArrayList<PersonsRelation> tree;

    public GeoTree() {
        tree = new ArrayList<>();
    }

    public ArrayList<PersonsRelation> getTree(){
        return tree;
    }

    public void addChildrenToParent(Person parent, Person children){
        tree.add(new PersonsRelation(parent, Relationship.children, children));
        tree.add(new PersonsRelation(parent, Relationship.parent, children));
    }

}
