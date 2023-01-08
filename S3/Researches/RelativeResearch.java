package S3.Researches;

import java.util.ArrayList;

import S3.IGeoTree;
import S3.Models.PersonsRelation;
import S3.Models.Relationship;
import S3.Models.Humans.Person;

public class RelativeResearch {
    
    private IGeoTree tree;


    public RelativeResearch(IGeoTree tree) {
        this.tree = tree;
    }

    public ArrayList<PersonsRelation> findChildren(Person p){
        ArrayList<PersonsRelation> rels = new ArrayList<>();
        for (PersonsRelation rel : tree.getTree()) {
            if(p.equals(rel.getMainPerson()) && rel.getRelationship() == Relationship.parent)
                rels.add(rel);
        }
        return rels;
    }



}
