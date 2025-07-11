//Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleTwo {

    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));
    }

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> selectedRow = new ArrayList<>();

        selectedRow.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            selectedRow.add(1);
            for (int j = i - 1; j >= 1; j--) {
                selectedRow.set(j, selectedRow.get(j) + selectedRow.get(j - 1));
            }
        }

        return selectedRow;

    }
}
