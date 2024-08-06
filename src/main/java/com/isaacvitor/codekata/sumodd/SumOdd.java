package com.isaacvitor.codekata.sumodd;

import java.util.ArrayList;
import java.util.List;

public class SumOdd {
    public static Long sumOdd(int rowNumber) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }
        int index = rowNumber - 1;
        int sum = 0;


    }
}
