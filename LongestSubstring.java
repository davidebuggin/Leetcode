//Given a string s, find the length of the longest substring without duplicate characters.

public class LongestSubstring {
    public static void main(String[] args) {

        String s = "aa";

        if (s == null || s.length() == 0) {
            System.out.println("0");
        }
        int maxLength = 0;
        String currentSubString = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!currentSubString.contains(String.valueOf(c))) {
                currentSubString += c;
            } else {
                maxLength = Math.max(maxLength, currentSubString.length());
                currentSubString = currentSubString.substring(currentSubString.indexOf(c) + 1) + c;
            }
        }

        maxLength = Math.max(maxLength, currentSubString.length());

        System.out.println(maxLength);
    }
}
