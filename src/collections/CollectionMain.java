package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class CollectionMain {

    public static void main(String[] args) {
//        getStudents();
        getSets();

    }

    private static void getSets() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        HashSet<String> hashSet = new HashSet();

        String test = "test";
        linkedHashSet.add(test + Math.random());
        linkedHashSet.add(test + Math.random());
//        hashSet.add(test);
//        hashSet.add(test);
        hashSet.add("test1");
        hashSet.add("test1");
        for (String elem:hashSet) {
            System.out.println(elem);

        }
        linkedHashSet.forEach(s -> System.out.println(s.toString()));
//        System.out.println(hashSet.iterator().next());

        hashSet.remove("test");
    }

    private static void getStudents() {
        HashMap<Integer, Student> students = new HashMap();
        Student kate = new Student("Kate", "12/23/1991", "female", 23);
        Student peter = new Student("Peter", "02/19/1992", "male", 22);
        Student jacob = new Student("Jacob", "05/12/1993", "male", 21);
        students.put(new Integer(1), kate);
        students.put(new Integer(2), peter);
        students.put(new Integer(3), jacob);
        students.put(new Integer(1), kate);

        System.out.println(students.get(1));

    }
}
