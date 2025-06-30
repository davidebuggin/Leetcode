/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
1.Open brackets must be closed by the same type of brackets.
2.Open brackets must be closed in the correct order.
3.Every close bracket has a corresponding open bracket of the same type.*/

import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        String s = "]";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        Set<Character> openPar = new HashSet<>();
        openPar.add('(');
        openPar.add('[');
        openPar.add('{');

        Map<Character, Character> matching = new HashMap<>();
        matching.put(')', '(');
        matching.put(']', '[');
        matching.put('}', '{');

        Deque<Character> stack = new ArrayDeque<Character>();

        for (char c : s.toCharArray()) {
            if (openPar.contains(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (stack.peek() == matching.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
