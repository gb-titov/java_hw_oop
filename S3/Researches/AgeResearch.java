package S3.Researches;

import java.util.ArrayList;

import S3.IGeoTree;
import S3.Models.PersonsRelation;

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
