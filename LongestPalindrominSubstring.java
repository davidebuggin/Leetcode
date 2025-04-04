public class LongestPalindrominSubstring {

    public static void main(String[] args) {

        String s = "babad";
        System.out.println(longestPalindrome(s));

    }

    public static String longestPalindrome(String s) {
        if ( s == null || s.length() < 1) {
            return "";
        } 

        int start = 0, end =0;

        for(int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len -1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    public static int expandAroundCenter(String s, int left, int right) {
        while(left >= 0 && right< s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left -1;
    }

}









































//Soluzione O(n^3) -- Molto lenta!
// public class LongestPalindrominSubstring {
    
//     public static void main(String[] args) {
//         String s = "cazzozpaaaaaapvertrev";

//         String longestSubstring = "";

//         for(int i = 0; i < s.length(); i ++){
//             for (int j = i + 1; j <= s.length(); j++){
//                 String substring = s.substring(i, j);

//                 if (isPalindrome(substring) && substring.length() > longestSubstring.length()){
//                     longestSubstring = substring;
//                 }
//             } 
//         }

//         System.out.println(longestSubstring);
//     }

//     public static boolean isPalindrome(String s) {
//         int left = 0;
//         int right = s.length() - 1;

//         while(left < right) {
//             if(s.charAt(left) != s.charAt(right)){
//                 return false;
//             }

//             left++;
//             right--;
//         }
//         return true;
//     }
// }
