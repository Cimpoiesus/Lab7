import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        IntSet set1 = new IntSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        IntSet set2 = new IntSet();
        set2.add(3);
        set2.add(1);
        set2.add(5);

        System.out.println("Set 1: " + set1.elements);
        System.out.println("Set 2: " + set2.elements);

        Set<Integer> union = set1.union(set2);
        System.out.println("Union: " + union);

        Set<Integer> intersection = set1.intersection(set2);
        System.out.println("Intersection: " + intersection);
    }
}