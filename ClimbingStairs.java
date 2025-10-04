/* Es 70 - You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?*/

public class ClimbingStairs {

    public static void main(String[] args) {

        int n = 9;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {

        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                int prev1 = 2;
                int prev2 = 1;
                for (int i = 3; i <= n; i++) {
                    int current = prev1 + prev2;
                    prev2 = prev1;
                    prev1 = current;
                }
                return prev1;
        }
    }
}
