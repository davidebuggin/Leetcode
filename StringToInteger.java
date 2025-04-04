public class StringToInteger {
    public static void main(String[] args) {
        String s = " 02210";
        System.out.println(myAtoi(s));
        
    }

    public static int myAtoi(String s){

        // boolean skipZero = true;
        boolean signDeterminatorViewed = false;
        boolean isNegative = false;
        int result = 0;

        for(char c : s.toCharArray()){
            
            if(Character.isWhitespace(c)){
                continue;
            } else if(c == '-' && !signDeterminatorViewed){
                isNegative = true;
            } else if(Character.isDigit(c)){
                if(c == 0 && skipZero){
                    continue;
                } else {
                    // skipZero = true;
                    signDeterminatorViewed = true;
                    int digit = c - '0';

                    result = result * 10 + digit;
                }
            } else {
                break;
            }

        }
        
        if(isNegative){
            result = result*(-1);
        }
        return result;
    }
}
