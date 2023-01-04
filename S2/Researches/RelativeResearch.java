package S2.Researches;

import java.util.ArrayList;

import S2.IGeoTree;
import S2.Models.Person;
import S2.Models.PersonsRelation;
import S2.Models.Relationship;

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
