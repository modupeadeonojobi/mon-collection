package in28minutes.company.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class stringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}

public class QueueRunner {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(new stringLengthComparator());
        queue.addAll(List.of("Apple", "Orange", "Water-melon", "Carrot", "Cashew", "Paw-paw"));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
