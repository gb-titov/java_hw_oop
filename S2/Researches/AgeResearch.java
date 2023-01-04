package S2.Researches;

import java.util.ArrayList;

import S2.IGeoTree;
import S2.Models.PersonsRelation;

public class AgeResearch {
    
    private IGeoTree tree;

    public AgeResearch(IGeoTree tree){
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
