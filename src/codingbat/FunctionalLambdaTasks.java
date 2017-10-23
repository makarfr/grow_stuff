package codingbat;

import java.util.*;
import java.util.stream.Collectors;

public class FunctionalLambdaTasks {

    public static void main(String[] args) {
        FunctionalLambdaTasks lambdaTasks = new FunctionalLambdaTasks();

        System.out.println(lambdaTasks.doubling(Arrays.asList(1, 2, 3)));
        ArrayList<Integer> integers = new ArrayList(Arrays.asList(9,12, 29, 3));
        System.out.println(lambdaTasks.no9(integers));
        System.out.println(lambdaTasks.noTeen(integers));
    }

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(s -> s * 2).collect(Collectors.toList());
    }

    public List<String> addStar(List<String> strings) {
        return strings.stream().map(s -> s + "*").collect(Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(s -> (s % 10) == 9);
        return nums;
    }

    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(s -> (s >= 13) && (s <= 19));
        return nums;
    }

    public List<String> noYY(List<String> strings) {
        return strings.stream().map(s -> s + "y")
                .filter(s -> !s.contains("yy")).collect(Collectors.toList());
    }

}
