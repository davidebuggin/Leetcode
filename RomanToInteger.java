//Given a roman numeral, convert it to an integer.

import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

        String s = "XXXI";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> romanMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int intNumber = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int val = romanMap.get(c);

            if (i + 1 < s.length() && val < romanMap.get(s.charAt(i + 1))) {
                intNumber -= val;
            } else {
                intNumber += val;
            }
        }

        return intNumber;
    }

}
