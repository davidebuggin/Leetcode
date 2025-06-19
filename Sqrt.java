public class Sqrt {
    
    public static void main(String[] args) {
        
        int x = 8;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        double y = (double)x;
        
        int res = (int)Math.sqrt(y);
        return res;
    }

}
