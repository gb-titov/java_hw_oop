package S3;

import java.util.ArrayList;

import S3.Models.PersonsRelation;
import S3.Models.Relationship;
import S3.Models.Humans.Person;

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
