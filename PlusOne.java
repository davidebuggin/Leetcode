import java.util.Arrays;

public class PlusOne {
    

    public static void main(String[] args) {
        int [] digits = {9};
        System.out.println(Arrays.toString(plusOne(digits))); //should return [1,2,4]
    }

    public static int[] plusOne(int[] digits){
    
        //aumentare di 1 l'ultima cifra dell'array, se == 9 allora sostituisco con 0 e aumento di 1 la cifra a dx

        for(int i = digits.length - 1; i >= 0; i--){
            digits[i] += 1;
            if(digits[i] < 10){
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int [] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    } 
}
