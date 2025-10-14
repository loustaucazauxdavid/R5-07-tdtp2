package com.loustaucazauxdavid.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "'3,5', 8",
            "'10,6,6', 22",
            "'5,5,4,7', 21",
            "'20', 20"
    })
    void evaluate_letruc_retourne_lebontruc(String expression, int resultatExpected)
    {
        StringCalculator calculator = new StringCalculator();

        int resultat = calculator.evaluate(expression);

        assertEquals(resultatExpected, resultat);
    }


}