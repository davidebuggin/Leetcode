import java.util.*;;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();
        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                sum = sum + (int) Math.pow(n % 10, 2);
                n = n / 10;
            }
            if (visited.contains(sum)) {
                return false;
            } else {
                visited.add(sum);
            }

            n = sum;
        }
        return true;

    }
}
