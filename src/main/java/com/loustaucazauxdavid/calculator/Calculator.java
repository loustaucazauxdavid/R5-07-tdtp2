package com.loustaucazauxdavid.calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {

    public static int add(int opG, int opD)
    {
        return  opG + opD;
    }

    public static int divide(int opG, int opD)
    {
        return  opG / opD;
    }

    public static Set<Integer> ensembleChiffres(int pNombre)
    {
        pNombre = Math.abs(pNombre); // Make the number positive

        Set<Integer> chiffres = new HashSet<>();

        // Itérer sur chaque caractère (chiffre) du nombre donné
        String pNombreStr = String.valueOf(pNombre);

        for (int i = 0; i < pNombreStr.length(); i++)
        {
            int currentDigit = Integer.parseInt(pNombreStr.substring(i, i+1)); // Chiffre actuel (reconverti en int)

            chiffres.add(currentDigit);
        }

        return chiffres;
    }
}