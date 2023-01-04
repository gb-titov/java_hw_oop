package S2;

import java.util.ArrayList;

import S2.Models.Person;
import S2.Models.PersonsRelation;
import S2.Models.Relationship;

public class GeoTree implements IGeoTree {
    private ArrayList<PersonsRelation> tree;

    public GeoTree() {
        tree = new ArrayList<>();
    }

    public ArrayList<PersonsRelation> getTree(){
        return tree;
    }

    public void addChildrenToParent(Person parent, Person children){
        tree.add(new PersonsRelation(parent, Relationship.parent, children));
        tree.add(new PersonsRelation(children, Relationship.children, parent));
    }

}
