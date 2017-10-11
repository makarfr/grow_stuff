package java8_features;

public class RecursionTasks {

    public static void main(String[] args) {
        int result = getFactorial(9);
        System.out.println(result);
    }

    private static int getFactorial(int n) {
        if(n==1){
            return n;
        }
       return n*(getFactorial(n-1));
    }
}
