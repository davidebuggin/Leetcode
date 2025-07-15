//Given a string s, return true if it is a palindrome, or false otherwise.

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        String reverse = new StringBuilder(s).reverse().toString();

        if (s.equals(reverse)) {
            return true;
        }
        return false;
    }
}
