//Given two binary strings a and b, return their sum as a binary string.

public class AddBinary {

    public static void main(String[] args) {

        String a = "11";
        String b = "1";

        System.out.println(addBinary(a, b));

    }

    public static String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = bitA + bitB + carry;
            int bitResult = sum % 2;
            carry = sum / 2;

            result.append(bitResult);

            i--;
            j--;

        }
        return result.reverse().toString();
    }
}
