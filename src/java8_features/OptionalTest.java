package java8_features;


import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Object option = Optional.ofNullable(null).orElse("hello");
        System.out.println(option.toString());
    }
}
