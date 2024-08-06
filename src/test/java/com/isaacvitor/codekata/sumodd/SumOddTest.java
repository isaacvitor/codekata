package com.isaacvitor.codekata.sumodd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumOddTest {
    @Test
    void whenSumOddRowOneIsExpectedOne(){
        Long expectedResult = 1l;

        Long actualResult = SumOdd.sumOdd(1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void whenSumOddRowTwoIsExpectedEight(){
        Long expectedResult = 8l;

        Long actualResult = SumOdd.sumOdd(1);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
