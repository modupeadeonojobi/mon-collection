package in28minutes.company.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    // DATA STRUCTURE
    /**
     * Array
     * LinkedList
     * */

    /**
     * List allow duplicate element. You care about position i.e to insert in a position, use list.  */
    public static void main(String[] args) {

	    List<String> words = List.of("House", "car", "Person");
	    List<String> wordsArrayList = new ArrayList<>(words); // Get an element is faster.
	    List<String> wordLinkedList = new LinkedList<>(words); // Faster insertion and deletion.
	    List<String> vector = new Vector<>(words); // Thread safety (Synchronized).

        List<String> list1 = List.of("Man", "Woman");
        List<String> list2 = List.of("Boy", "Girl");

        List<String> merge = new ArrayList<>(list1);
        System.out.println(merge);
        merge.addAll(list2);
        System.out.println(merge);

        System.out.println(" ");
        System.out.println("Iterating over the array.");
        for (String word : merge) {
            if (word.endsWith("an")) {
                System.out.println(word);
            }
        }


        wordsArrayList.add( "Mango");
        wordLinkedList.add("Pear");
        vector.add("Banana");

        System.out.println("ArrayList : " +  wordsArrayList);
        System.out.println("LinkedList : " + wordLinkedList);
        System.out.println("Vector : " + vector);


    }
}
