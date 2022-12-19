package S1.Researches;

import java.util.ArrayList;

import S1.GeoTree;
import S1.Models.PersonsRelation;

public class AgeResearch {
    
    private GeoTree tree;

    public AgeResearch(GeoTree tree){
        this.tree = tree;
    }

    public ArrayList<PersonsRelation> findOlderThan(int age){
        ArrayList<PersonsRelation> rels = new ArrayList<>();
        for (PersonsRelation rel : tree.getTree()) {
            if(rel.getMainPerson().age > age)
                rels.add(rel);
        }
        return rels;
    }

}
