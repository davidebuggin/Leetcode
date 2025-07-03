//Given an integer numRows, return the first numRows of Pascal's triangle.

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        if (numRows == 0) {
            return pascalTriangle;
        }

        for (int i = 0; i < numRows; i++) {
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);

            if (i > 0) {
                List<Integer> prevRow = pascalTriangle.get(i - 1);
                for (int j = 1; j < i; j++) {
                    int sum = prevRow.get(j - 1) + prevRow.get(j);
                    newRow.add(sum);
                }

                newRow.add(1);
            }

            pascalTriangle.add(newRow);
        }
        return pascalTriangle;

    }
}
