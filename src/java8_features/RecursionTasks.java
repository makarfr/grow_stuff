package java8_features;

public class RecursionTasks {

    public static void main(String[] args) {
//        int result = getFactorial(9);
//        System.out.println(result);
        RecursionTasks recursionTasks = new RecursionTasks();
//        System.out.println(recursionTasks.bunnyEars(1));
//        System.out.println(recursionTasks.fibonacci(2));
//        System.out.println(recursionTasks.bunnyEars2(3));
//        System.out.println(recursionTasks.triangle(2));
//        System.out.println(recursionTasks.sumDigits(12));
        System.out.println(recursionTasks.count7(7717));
    }

    private static int getFactorial(int n) {
        if (n == 1) {
            return n;
        }
        return n * (getFactorial(n - 1));
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        return bunnyEars(bunnies - 1) + 2;
    }

    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        Integer bunny = bunnies;
        if ((bunny.doubleValue() % 2.0) == 0) {
            return bunnyEars2(bunnies - 1) + 3;
        } else return bunnyEars2(bunnies - 1) + 2;

    }

    public int triangle(int rows) {
        if (rows == 0) return 0;
        return rows + triangle(rows - 1);
    }

    public int sumDigits(int n) {
        if (n == 0) return 0;
        int lastDigit = n % 10;
        int restDigits = n / 10;
        return lastDigit + sumDigits(restDigits);
    }

    public int count7(int n) {
        if (n == 0) return 0;
        int lastDigit = n % 10;
        int restDigits = n / 10;
        if (lastDigit == 7) {
            return 1 + count7(restDigits);
        }
        return count7(restDigits);
    }


}
