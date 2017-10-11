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
//        System.out.println(recursionTasks.count7(7717));
//        System.out.println(recursionTasks.count8(8088));
//        System.out.println(recursionTasks.powerN(3, 2));
//        System.out.println(recursionTasks.countHi("xxhixhix"));
//        int[] numbers = {1, 6, 4};
//        System.out.println(recursionTasks.array6(numbers, 0));
//        int[] numbers1 = {1, 2, 11, 11};
//        System.out.println(recursionTasks.array11(numbers1, 0));
//        int[] numbers1 = {0, 0};
//        System.out.println(recursionTasks.array220(numbers1, 0));
        System.out.println(recursionTasks.allStar(""));
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

    public int count8(int n) {
        if (n == 0) return 0;
        int lastDigit = n % 10;
        int restDigits = n / 10;
        if (lastDigit == 8) {
            if ((restDigits % 10) == 8) {
                return 2 + count8(restDigits);
            }
            return 1 + count8(restDigits);
        }
        return count8(restDigits);
    }

    public int powerN(int base, int n) {
        if (n == 0) return 1;
        return base * powerN(base, n - 1);
    }

    public int countX(String str) {
        if (str.contains("x")) {
            if (str.substring(0, 1).equals("x")) {
                return 1 + countX(str.substring(1));
            }
            return countX(str.substring(1));
        } else return 0;
    }

    public int countHi(String str) {
        if (str.contains("hi")) {
            if (str.substring(0, 2).equals("hi")) {
                return 1 + countHi(str.substring(1));
            }
            return countHi(str.substring(1));
        } else return 0;
    }

    public boolean array6(int[] nums, int index) {
        if (index > nums.length - 1) return false;
        if (nums[index] == 6) {
            return true;
        }
        return array6(nums, index + 1);
    }

    public int array11(int[] nums, int index) {
        int result = 0;
        if (index > nums.length - 1) return 0;
        if (nums[index] == 11) {
            result += 1;
        }
        return result + array11(nums, index + 1);
    }

    public boolean array220(int[] nums, int index) {
        if (index + 1 > nums.length - 1) return false;
        if (nums[index] == 0) {
            return true;
        }
        if ((nums[index + 1] / nums[index] == 10) && (nums[index + 1] % nums[index] == 0)) {
            return true;
        }

        return array220(nums, index + 1);
    }

    public String allStar(String str) {
        if (str.isEmpty()) return "";
        if (str.length() - 1 == 0) return str;

        return str.substring(0, 1) + "*" + allStar(str.substring(1));
    }

}
