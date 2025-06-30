/* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits. */

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = { 9 };
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += 1;
            if (digits[i] < 10) {
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    }
}
