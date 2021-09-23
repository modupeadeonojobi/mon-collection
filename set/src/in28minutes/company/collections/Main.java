package in28minutes.company.collections;

import java.util.*;

public class Main {

    // DATA STRUCTURE is a container that stores data in a specific layout.
    // Arrays, Linked Lists, Hash Tables, Trees, Stacks(Famous for undo function), Queues, Graphs
    // DATA STRUCTURE is how the data is represented inside the storage in memory
    // COLLECTION in the Java sense refers to any class that implements the Collection interface
    // A collection is how it can be accessed. I stress on the word "can".

    /** TREE => Stores element in sorted order.
     * Reduces the cost of search, delete and insert
     * while keeping data in a sorted way.
     *
     * TREE SET => Implement navigable set interface.
     * floor() <= the number
     * lower() < the number
     * ceiling() >= the number
     * higher() > the number
     * subSet(a, b) retrieve number between a and b. Fn >= a && < b
     */
    /** HASH TABLE =>  Unique, it does not allow duplication.
     * It is used to store unique values. Can't add at a position
     * Faster searches, search is very easy because you look for an element
     * in a certain bucket and not searching through all bucket.
     * Java uses hashcode to determine the bucket to insert an element the table.
     * Use hashing to determine insertion position. Fn mod 13. % = index
     */
    /** QUEUE => First in, first out.
     * poll() to remove element
     * offer() to add element */


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

        Set<Integer> treeNumber = new TreeSet<>();
        treeNumber.add(909890);
        treeNumber.add(90989);
        treeNumber.add(9878);
        treeNumber.add(989);
        treeNumber.add(78);
        System.out.println("Tree => " + treeNumber);

        exercise1();

    }

    public static void exercise1() {
        List<Character> characterList = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
        Set<Character> sortedCharacter = new TreeSet<>(characterList);
        System.out.println("Sorted character form exercise 1 => " + sortedCharacter);

        Set<Character> linkedHashCharacter = new LinkedHashSet<>(characterList);
        System.out.println("Maintained insertion order => " + linkedHashCharacter);

        Set<Character> hashCharacter = new HashSet<>(characterList);
        System.out.println("!Sorted !insertion order && most efficient => " + hashCharacter);

    }
}
