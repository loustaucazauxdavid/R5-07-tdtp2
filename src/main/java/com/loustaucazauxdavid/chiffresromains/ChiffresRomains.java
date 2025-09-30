package com.loustaucazauxdavid.chiffresromains;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

public class ChiffresRomains {

    static int[] chiffresNumeriques = { 1, 5, 10, 50, 100, 500, 1000 };
    static String[] chiffresRomains = { "I", "V", "X", "L", "C", "D", "M" };

    static String convert(int nbr) {

        // Retourner directement la valeur si pas besoin de calcul
        int arrayPos = arrayIndexOf(chiffresNumeriques, nbr);
        if (arrayPos != -1) {
            return chiffresRomains[arrayPos];
        }

        int nbrRestant = nbr;

        String resultat = "";

        // Approche décroissante en utilisant la liste des clés

        for (int i = chiffresNumeriques.length - 1; i > 0; i--) {

            int trucCourant = chiffresNumeriques[i];

            int foisDuNb = nbrRestant / trucCourant; // On s'intéresse seulement à la partie entière (1, 2, 3, 4..)

            for (int j = 1; j < (Integer) foisDuNb + 1 && j <= 3; j++) {
                resultat += chiffresRomains[i];
                nbrRestant -= trucCourant;
            }

            // Ajouter le surplus ("I" pour 6 par exemple en étant sur "V" => "VI")
            if (-4 < nbrRestant - trucCourant && nbrRestant - trucCourant < 0) {
                for (int k = 1; k <= nbrRestant - trucCourant; k++) {
                    resultat += chiffresRomains[i + 1];
                }
            }
        }

        System.out.println("Résultat : " + resultat);

        return resultat;

    }

    static int arrayIndexOf(int[] numbers, int target) {
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
