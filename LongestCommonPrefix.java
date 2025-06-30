// Write a function to find the longest common prefix string amongst an array of strings.

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strs = { "flowers", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        StringBuilder longestPrefix = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return longestPrefix.toString();
                }
            }

            longestPrefix.append(currentChar);
        }

        return longestPrefix.toString();
    }
}
