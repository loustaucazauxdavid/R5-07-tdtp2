package com.loustaucazauxdavid.facteurspremiers;

import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {

    static List<Integer> generate(int nb) {
         List<Integer> facteursPremiers = new ArrayList<Integer>();

         if (nb == 1)
         {
            return facteursPremiers;
         }

         for (int i = 2; i < nb+1; i++) {

             // Ajouter le nombre courant s'il est premier ET qu'il est premier avec nb
             if (isPrime(i) && nb % i == 0) {
                 facteursPremiers.add(i);
             }
         }

         return facteursPremiers;
    }

    static boolean isPrime(int nb) {
        int nbDiv = 0;

        for (int i = 1; i < nb+1; i++) {
            if (nb % i == 0) {
                nbDiv += 1;
            }
        }

        // Doit avoir exactement 2 diviseurs pour être premier
        return nbDiv == 2;
    }

}
