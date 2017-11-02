package coderbyte_challenge;

import java.util.Arrays;

public class EasyChallenge {

    public static void main(String[] args) {
        EasyChallenge easyChallenge = new EasyChallenge();
//        System.out.println(easyChallenge.LetterChanges("fun times!"));
//        System.out.println(easyChallenge.LetterCapitalize("fun times again!"));
//        System.out.println(easyChallenge.SimpleAdding(12));
        System.out.println(easyChallenge.SimpleSymbols("d+d+=+h+"));
        System.out.println(easyChallenge.TimeConvert(8));
        System.out.println(easyChallenge.AlphabetSoup("coderbyte"));

    }

    //    https://coderbyte.com/information/Letter%20Changes
    //failed
    public String FirstReverse(String str) {
        StringBuffer reverse = new StringBuffer(str);
        reverse.reverse();
        return reverse.toString();

    }

    public String AlphabetSoup(String str) {
//        StringBuffer buffer = new StringBuffer();
//        str.codePoints().sorted().forEach(s -> buffer.append(Character.toString((char) s)));
//        return buffer.toString();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static String TimeConvert(int num) {
        int hours = num / 60;
        int minutes = num % 60;
        return hours + ":" + minutes;
    }

    public static String SimpleSymbols(String str) {
        String result = "false";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).matches("[a-zA-Z]")) {
                if ((i - 1 < 0) || (i + 2 > str.length())) {
                    return "false";
                }
                if (str.substring(i - 1, i).equals("+") && str.substring(i + 1, i + 2).equals("+")) {
                    result = "true";
                } else result = "false";
            }
        }
        return result;
    }

    public static String CheckNums(int num1, int num2) {
        if (num2 > num1) {
            return "true";
        } else if (num1 == num2) {
            return "-1";
        }
        return "false";
    }

    public static String LetterCapitalize(String str) {
        StringBuffer buffer = new StringBuffer();
        String[] split = str.split(" ");
        for (int i = 0; i < split.length; i++) {
            String word = split[i];
            buffer.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
            buffer.append(" ");
        }
        return buffer.toString();
    }

    public static int SimpleAdding(int num) {
        if (num == 0) {
            return 0;
        }
        return num + SimpleAdding(num - 1);

    }

    public static String LetterChanges(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.toString(c).matches("[a-zA-Z]")) {
                int n = (int) c + 1;
                String symbol = Character.toString((char) n);
                if (symbol.matches("[aeiou]")) {
                    sb.append(symbol.toUpperCase());
                } else sb.append(symbol);
            } else sb.append(c);
        }
        return sb.toString();

    }
}
