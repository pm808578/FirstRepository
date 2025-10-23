package Oct18_CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraListUsingIterator {

    static void main(String[] args) {
        ArrayList<Object>  list=new ArrayList<>();

        list.add(45);
        list.add(30);
        list.add("Pragati");
        list.add('F');
        list.add(true);

        System.out.println(list);

        System.out.println("  printing the Arralist   usiing Iterator");
        Iterator it = list.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }

        System.out.println(" Using List Iterator backward traversing");
        ListIterator<Object> listIterator= list.listIterator();

            while(listIterator.hasPrevious())
            {
                System.out.println(listIterator.previous());
            }
    }
}
