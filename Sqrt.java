/* Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.*/

public class Sqrt {

    public static void main(String[] args) {

        int x = 8;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        double y = (double) x;

        int res = (int) Math.sqrt(y);
        return res;
    }

}
