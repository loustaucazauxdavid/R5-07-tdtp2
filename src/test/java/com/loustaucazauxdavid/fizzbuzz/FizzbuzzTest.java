package com.loustaucazauxdavid.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

    @Test
    void fizzbuzz_de_1_devrait_retourner_1() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String nb = fizzbuzz.de(1);

        assertEquals("1", nb);
    }

    @Test
    void fizzbuzz_de_12_devrait_retourner_fizz() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String nb = fizzbuzz.de(12);

        assertEquals("fizz", nb);
    }

    @Test
    void fizzbuzz_de_15_devrait_retourner_fizzbuzz() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String nb = fizzbuzz.de(15);

        assertEquals("fizzbuzz", nb);
    }

    @Test
    void fizzbuzz_de_20_devrait_retourner_buzz() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String nb = fizzbuzz.de(20);

        assertEquals("buzz", nb);
    }

}