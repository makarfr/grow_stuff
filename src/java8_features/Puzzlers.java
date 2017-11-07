package java8_features;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class Puzzlers {

    public static void main(String[] args) {
//        madMax();
        Puzzlers puzzlers = new Puzzlers();
//        puzzlers.doubleColon();
        functionalInt();
        referenceOnConstructor();
        Map<Integer, String> map = new HashMap();
        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));             // val9

        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));             // val9concat
    }


    public void killAll() {
        ExecutorService ex = Executors.newSingleThreadExecutor();
        List<String> sentence = Arrays.asList("Kill");

        ex.submit(() -> Files.write(Paths.get(""), sentence));

//        ex.submit(() -> {Files.write(Paths.get(""), sentence); });
    }


    private static void referenceOnConstructor() {
        PersonFactory<Person> personFactory = Person::new;
        Person peter = personFactory.create("Peter", "Parker");
        Person parker = personFactory.create("Parker", "Peter");
        System.out.println(peter.firstName);
        System.out.println(peter.firstName);

    }

    private static void functionalInt() {
        List<Integer> myList = Arrays.asList(-3, -2, -1, 0, 1, 2, 3);
        IntPredicate prUpperZero = value -> value > 0;
        IntPredicate prBelowOne = value -> value <= 1;
//        myList.stream().filter(prUpperZero::test).forEach(System.out::println);
        myList.stream().filter(prUpperZero.and(prBelowOne)::test).forEach(System.out::println);


    }

    private void doubleColon() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<Integer> myListInt = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("-------Using Lambda Functions--------");
        myList.stream().map(s -> s.toUpperCase()).sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println("-------Using Method Reference--------");
        myList.stream().map(String::toUpperCase).sorted().forEach(System.out::print);
        System.out.println();
        myListInt.stream().map(this::multiply).sorted().forEach(System.out::println);
        myListInt.forEach(this::printSqrtValue);

    }

    private int multiply(Integer i) {
        return i * 10;
    }

    private void printSqrtValue(Integer i) {
        System.out.println(Math.sqrt(i.doubleValue()));
    }

    private static void madMax() {
        System.out.println(Stream.of(-3, -2, -1, 0, 1, 2, 3).max(Math::max).get());
    }

}
