import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("abshhd");

        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Ravi");
        treeSet.add("Vijay");
        treeSet.add("Ashhd");

        Iterator<String> itr=treeSet.descendingIterator();
        while(itr.hasNext()){ System.out.println(itr.next()); }
    }
}

