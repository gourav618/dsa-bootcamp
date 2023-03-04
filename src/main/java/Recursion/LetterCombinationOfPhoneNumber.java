package Recursion;

import java.util.*;

public class LetterCombinationOfPhoneNumber {
    public static void main(String[] args){
        //https://leetcode.com/problems/letter-combinations-of-a-phone-number/

        String digits = "23";

        System.out.println(letterCombinations(digits));
        System.out.println(letterCombinations(""));
        System.out.println(letterCombinations("2"));

    }

    private static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        List<List<String>> letters = new ArrayList<>(Arrays.asList(List.of(), List.of(), List.of("a", "b", "c"), List.of("d", "e", "f"), List.of("g", "h", "i"),
                List.of("j", "k", "l"), List.of("m", "n", "o"), List.of("p", "q", "r", "s"), List.of("t", "u", "v"), List.of("w", "x", "y", "z")));

        StringBuilder s = new StringBuilder();
        if (digits.length() != 0) {
            getLetterCombination(combinations, digits, letters, s, 0);
        }
        return combinations;
    }

    private static void getLetterCombination(List<String> combinations, String digits, List<List<String>> letters, StringBuilder s, int i) {
        if (i == digits.length()){
            combinations.add(String.valueOf(s));
            return;
        }

        int digit = Integer.parseInt(String.valueOf(digits.charAt(i)));
        List<String> choices = letters.get(digit);
        for (int k = 0; k<choices.size(); k++){
            getLetterCombination(combinations, digits, letters, s.append(choices.get(k)), i+1);
            s.deleteCharAt(i);
        }
    }
}
