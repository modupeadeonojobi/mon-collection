package in28minutes.company.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

    public static void main(String[] args) {
        List<Student> students = List.of(new Student(2, "Andrew"),
                new Student(3, "Paul"),
                new Student(1, "Martha"
                ));

        List<Student> studentList = new ArrayList<>(students);
        System.out.println(studentList);
        Collections.sort(studentList);
        System.out.println(studentList);

    }
}
