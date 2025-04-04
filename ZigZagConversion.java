public class ZigZagConversion {
    
    public static void main(String[] args) {
        
        String s  = "PAYPALISHIRING";
        int numRows = 4;

        System.out.println(convert(s, numRows));

    }

    public static String convert(String s, int numRows) {
        
        StringBuilder [] rows = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++){
            rows[i] = new StringBuilder();
        }
        
        int currentRow = 0;
        boolean goingDown = false;

        for(char c: s.toCharArray()){
            rows[currentRow].append(c);  //AGGIUNGIAMO C(LA LETTERA CORRENTE) NELLA RIGA CORRENTE.
            if(currentRow == 0|| currentRow == numRows-1) { //Cambiare direzione se ci troviamo nella prima riga o nell'ultima
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1: -1;
        }
        
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows) {
            result.append(row);
        }
        
        
        
        
        
        
        return result.toString(); 
    }



}
