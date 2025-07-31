// Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 1;
        System.out.println(convertToTile(columnNumber));

    }

    public static String convertToTile(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26;
            char currentLetter = (char) ('A' + remainder);
            result.insert(0, currentLetter);
            columnNumber = (columnNumber - 1) / 26;
        }
        return result.toString();
    }
}
