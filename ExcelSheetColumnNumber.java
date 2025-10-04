// Es 171 - Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String columnTitle = "AAA";
        System.out.println(titleToNumber(columnTitle));
    }

    public static int titleToNumber(String columnTitle) {
        int ColumnNumber = 0;
        for (char c : columnTitle.toCharArray()) {
            int value = c - 'A' + 1;
            ColumnNumber = ColumnNumber * 26 + value;
        }
        return ColumnNumber;
    }
}
