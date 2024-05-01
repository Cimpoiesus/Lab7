import java.util.HashSet;
import java.util.Set;

public class IntSet {
    Set<Integer> elements;

    public IntSet() {
        this.elements = new HashSet<>();
    }

    public void add(int element) {
        elements.add(element);
    }


    public Set<Integer> union(IntSet otherSet) {
        Set<Integer> unionSet = new HashSet<>(this.elements);
        unionSet.addAll(otherSet.elements);
        return unionSet;
    }

    public Set<Integer> intersection(IntSet otherSet) {
        Set<Integer> intersectionSet = new HashSet<>(this.elements);
        intersectionSet.retainAll(otherSet.elements);
        return intersectionSet;
    }
}
