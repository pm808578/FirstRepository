package Oct18_CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Inserting at index
        fruits.add(1, "Grapes");  // apple, grapes, banana, mango, Orange

        System.out.println("Fruits List: " + fruits);

        System.out.println("First Fruit: " + fruits.get(0));   // apple

        fruits.set(2, "Pineapple");
        System.out.println("After update: " + fruits);  //apple, grapes, Pineapple, mango, Orange


        fruits.remove(2);
        System.out.println("After removal: pineapple " + fruits);

        // Check size
        System.out.println("List size: " + fruits.size());

        // Check if contains
        System.out.println("Contains Apple? " + fruits.contains("Apple"));

        // Looping
        System.out.println("Looping through ArrayList:");
        Iterator<String> it= fruits.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
