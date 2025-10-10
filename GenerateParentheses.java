// Es 22 - Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n){
        List<String> result = new ArrayList<>();
        String current = "";
        int openLeft = n;
        int closeLeft = n;
        helper(current, openLeft, closeLeft, result);
        return result;
    }   
    private static void helper(String current, int openLeft, int closeLeft, List<String> result){
        if(openLeft == 0 && closeLeft == 0){
            result.add(current);
            return;
        }
        if(openLeft > 0) {
            helper(current+"(", openLeft - 1, closeLeft, result);
        }
        if(closeLeft > 0 && closeLeft > openLeft) {
            helper(current+")", openLeft, closeLeft - 1, result);
        }
    }
}
