package java8_features;


import org.apache.commons.lang3.ArrayUtils;

import java.util.*;

public class AnagramKata {

    public static void main(String[] args) {
        String inputWord = "catt";
        List<String> anagrams = createAnagrams(inputWord);
        System.out.println(anagrams);
    }

    private static List<String> createAnagrams(String inputWord) {
        List<String> result = new ArrayList<>();
        char[] letters = inputWord.toCharArray();
        createResultAnagram(letters, "", result);
        return result;
    }

    private static void createResultAnagram(char[] letters, String currentResult, List<String> result) {
        if (letters.length == 0) {
            result.add(currentResult);
        }
        for (int i = 0; i < letters.length; i++) {
            char currentChar = letters[i];
            createResultAnagram(ArrayUtils.remove(letters, i), currentResult + currentChar, result);
        }
    }
}