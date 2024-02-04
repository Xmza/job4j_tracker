package ru.job4j.collection;

import javax.security.auth.login.AccountExpiredException;
import java.util.List;

public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0;
        int cell = 0;
        for (Integer number : list) {
            array[row][cell] = number;
            if (cell == cells -1) {
                row++;
                cell = 0;
            } else {
                cell++;
            }
        }
        return array;

    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] result = toArray(list, 3);
        for (int[] row : result) {
            for (int cell : row) {
                System.out.println(cell + " ");
            }
            System.out.println();
        }
    }
}
