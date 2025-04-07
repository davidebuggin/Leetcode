public class PalindromeNumber {
  
    public static void main(String[] args) {
        
        int x = 1221;
        System.out.println(isPalindrome(x));

    }

    public static boolean isPalindrome(int x) {
        
        if (x < 0){
            return false;
        }

        String originale = Integer.toString(x);
        String inverso = new StringBuilder(originale).reverse().toString();

        return originale.equals(inverso);
        
    }
}
