package com.loustaucazauxdavid.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.Console;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void doit_additionner_deux_entiers() {
        int a = 1;
        int b = 2;

        int result = Calculator.add(a, b);

        assertEquals(a + b, result);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "-2, 2, 0",
            "0, 0, 0",
            "-1, -2, -3"
    })
    void doit_additionner_params(int a, int b, int expectedResult) {
        int result = Calculator.add(a, b);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "7679, '6,7,9'",
            "-11, '1'"
    })
    void doit_retourner_chiffres_du_nombre(int nb, String expectedResultStr)
    {
        // Parse the expectedResult argument
        Set<Integer> expectedResult = new HashSet<>();
        for (String s : expectedResultStr.split(",")) {
            expectedResult.add(Integer.parseInt(s));
        }

        // Test
        Set<Integer> result = Calculator.ensembleChiffres(nb);

        assertEquals(expectedResult, result);
    }

    
}