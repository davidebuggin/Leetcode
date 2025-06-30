/* Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
The algorithm for myAtoi(string s) is as follows:
1.Whitespace: Ignore any leading whitespace (" ").
2.Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
3.Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
4.Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. 
Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
Return the integer as the final result. */

public class StringToInteger {
    public static void main(String[] args) {
        String s = "  123";
        System.out.println(myAtoi(s));

    }

    public static int myAtoi(String s) {

        boolean signDeterminatorViewed = false;
        boolean isNegative = false;
        int result = 0;

        for (char c : s.toCharArray()) {

            if (Character.isWhitespace(c)) {
                if (signDeterminatorViewed || result != 0) {
                    break;
                }
                continue;
            } else if (c == '-' && !signDeterminatorViewed) {
                isNegative = true;
                signDeterminatorViewed = true;
            } else if (c == '+' && !signDeterminatorViewed) {
                signDeterminatorViewed = true;
            } else if (Character.isDigit(c)) {
                signDeterminatorViewed = true;
                int digit = c - '0';
                if (result > (Integer.MAX_VALUE - digit) / 10) {
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + digit;
            } else {
                break;
            }

        }

        if (isNegative) {
            result = result * (-1);
        }

        return result;
    }
}
