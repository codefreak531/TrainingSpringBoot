import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("qwe");
        linkedList.add("asd");

        Iterator iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        ArrayListExample arrayListExample = new ArrayListExample();
        Iterator iterator1 = ArrayListExample.mylist.iterator();


    }
}
