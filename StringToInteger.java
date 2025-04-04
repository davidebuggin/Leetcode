public class StringToInteger {
    public static void main(String[] args) {
        String s = "  123";
        System.out.println(myAtoi(s));
        
    }

    public static int myAtoi(String s){

        boolean signDeterminatorViewed = false;
        boolean isNegative = false;
        int result = 0;

        for(char c : s.toCharArray()){
            
            if(Character.isWhitespace(c)){
                if(signDeterminatorViewed || result != 0){break;}
                continue;
            } else if(c == '-' && !signDeterminatorViewed){
                isNegative = true;
                signDeterminatorViewed = true;
            } else if(c == '+' && !signDeterminatorViewed) {
                signDeterminatorViewed = true;
            } else if(Character.isDigit(c)){
                signDeterminatorViewed = true;
                int digit = c - '0';
                if(result > (Integer.MAX_VALUE - digit) / 10){
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + digit;
            }
            else {
                break;
            }

        }
        
        if(isNegative){
            result = result*(-1);
        }
        
        return result;
    }
}
