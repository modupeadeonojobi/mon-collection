package in28minutes.company.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    // DATA STRUCTURE
    /** TREE => Stores element in sorted order.
     * Reduces the cost of search, delete and insert
     * while keeping data in a sorted way.
     */
    /** HASHING =>  Unique, it does not allow duplication.
     * It is used to store unique values. Can't add at a position
     * Faster searches, search is very easy because you look for an element
     * in a certain bucket and not searching through all bucket.
     * Java uses hashcode to determine the bucket to insert an element the table.
     Use hashing to determine insertion position. Fn mod 13. % = index */


    public static void main(String[] args) {
//        Set<String> fruits = Set.of("Banana", "Apple", "Mango");

        Set<Integer> hashNumber = new HashSet<>(); // No order of insertion and sort order.
        hashNumber.add(909890);
        hashNumber.add(90989);
        hashNumber.add(9878);
        hashNumber.add(989);
        hashNumber.add(78);
        System.out.println("Hash => " + hashNumber);

        Set<Integer> linkedListNumber = new LinkedHashSet<>(); // Yes to insertion order.
        linkedListNumber.add(909890);
        linkedListNumber.add(90989);
        linkedListNumber.add(9878);
        linkedListNumber.add(989);
        linkedListNumber.add(78);
        System.out.println("Linked => " + linkedListNumber);


    }
}
