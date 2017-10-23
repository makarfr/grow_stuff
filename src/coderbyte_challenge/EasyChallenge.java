package coderbyte_challenge;

public class EasyChallenge {

    public static void main(String[] args) {
        EasyChallenge easyChallenge = new EasyChallenge();
        System.out.println(easyChallenge.LetterChanges("hello*3"));

    }

    //    https://coderbyte.com/information/Letter%20Changes
    //failed
    public String FirstReverse(String str) {
        StringBuffer reverse = new StringBuffer(str);
        reverse.reverse();
        return reverse.toString();

    }

    public static String LetterChanges(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            int n = (int) c + 1;
            sb.append((char) n);
        }
        return sb.toString();

    }
}
