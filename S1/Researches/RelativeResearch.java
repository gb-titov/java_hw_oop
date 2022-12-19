package S1.Researches;

import java.util.ArrayList;

import S1.GeoTree;
import S1.Models.Person;
import S1.Models.PersonsRelation;
import S1.Models.Relationship;

public class RelativeResearch {
    
    private GeoTree tree;


    public RelativeResearch(GeoTree tree) {
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
