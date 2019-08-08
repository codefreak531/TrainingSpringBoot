import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    static ArrayList<String> mylist;

    public static void main(String[] args) {

        mylist = new ArrayList<String>();
        mylist.add("abc");
        mylist.add("xyz");

        Iterator iterator = mylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
