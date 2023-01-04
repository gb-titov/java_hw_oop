package S2;

import java.util.ArrayList;

import S2.Models.Person;
import S2.Models.PersonsRelation;

public interface IGeoTree {
    ArrayList<PersonsRelation> getTree();
    void addChildrenToParent(Person parent, Person children);
}
