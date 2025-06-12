public class LenghtOfLastWord {
    

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        boolean started = false;

        for(int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            
            if(c != ' '){
                started = true;
                count++;
            } else if (started) {
                break;
            }
        }
        return count;
    }
}
