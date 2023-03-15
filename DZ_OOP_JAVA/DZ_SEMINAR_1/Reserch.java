package DZ_OOP_JAVA.DZ_SEMINAR_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        this.tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public LocalDate birthDay(Person p){
        return p.getBirthDay();
    }

    public LocalDate deathDay(Person p){
        return p.getDeathDay();
    }

}