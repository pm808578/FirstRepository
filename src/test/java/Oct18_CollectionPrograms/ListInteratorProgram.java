package Oct18_CollectionPrograms;
import java.util.ArrayList;
import java.util.ListIterator;
//  25. Write a program to access arraylist by using iterator and listIterator?

public class ListInteratorProgram {

        public static void main(String[] args) {

            ArrayList<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Mango");
            fruits.add("Orange");


            System.out.println("\nAccessing ArrayList using ListIterator (Forward):");
            ListIterator<String> listIterator = fruits.listIterator();
            while (listIterator.hasNext()) {
                String fruit = listIterator.next();
                System.out.println(fruit);
            }

            System.out.println("\nAccessing ArrayList using ListIterator (Backward):");
            while (listIterator.hasPrevious()) {
                String fruit = listIterator.previous();
                System.out.println(fruit);
            }
        }
    }


