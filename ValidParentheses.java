import java.util.*;

public class ValidParentheses {
    

    public static void main(String [] args) {
        String s = "]";
        System.out.println(isValid(s));

    }

    public static boolean isValid (String s) {
        Set<Character> openPar = new HashSet<>();
        openPar.add('(');
        openPar.add('[');
        openPar.add('{');
        
        Map<Character, Character> matching = new HashMap<>();
        matching.put(')', '(');
        matching.put(']', '[');
        matching.put('}', '{');
        
        Deque<Character> stack = new ArrayDeque<Character>();
        
        for(char c : s.toCharArray()) {
            if(openPar.contains(c)){
                stack.push(c);
            } else {
                if(stack.isEmpty()){ 
                    return false;
                }
                
                if(stack.peek() == matching.get(c)){
                    stack.pop();
                } else{
                    return false;
                }
            }
        }
        
        if (stack.isEmpty()){
            return true;
        } 
        return false;
    }
}
