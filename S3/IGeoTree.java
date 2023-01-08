package S3;

import java.util.ArrayList;

import S3.Models.PersonsRelation;
import S3.Models.Humans.Person;

public interface IGeoTree {
    ArrayList<PersonsRelation> getTree();
    void addChildrenToParent(Person parent, Person children);
}
