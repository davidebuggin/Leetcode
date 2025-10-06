// Es 17 - Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        String digits = "7";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> letterCombinations = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return letterCombinations;

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(digits, 0, "", letterCombinations, map);

        return letterCombinations;
    }

    public static void backtrack(String digits, int index, String current, List<String> letterCombinations,
            Map<Character, String> map) {
        if (index == digits.length()) {
            letterCombinations.add(current);
            return;
        }

        char digit = digits.charAt(index);
        String letters = map.get(digit);

        for (char c : letters.toCharArray()) {
            backtrack(digits, index + 1, current + c, letterCombinations, map);
        }
    }
}
