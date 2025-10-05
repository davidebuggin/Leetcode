// Es 191 - Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

public class NumberOf1Bits {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }

        return count;
    }
}
