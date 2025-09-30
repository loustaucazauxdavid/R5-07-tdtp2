package com.loustaucazauxdavid.facteurspremiers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FacteursPremiersTest {

    @Test
    void generate_avec_un_renvoie_liste_vide () {
        int nb = 1;

        List<Integer> facteursPremiers = FacteursPremiers.generate(nb);
        assertEquals (0, facteursPremiers.size());
    }

    @Test
    void generate_avec_deux_renvoie_liste_avec_deux () {
        int nb = 2;

        List<Integer> facteursPremiersAttendus = new ArrayList<>();
        facteursPremiersAttendus.add(2);

        List<Integer> facteursPremiers = FacteursPremiers.generate(nb);
        assertEquals (facteursPremiersAttendus, facteursPremiers);
    }

    @Test
    void generate_avec_deux_renvoie_liste_avec_deux_trois () {
        int nb = 6;

        List<Integer> facteursPremiersAttendus = new ArrayList<>();
        facteursPremiersAttendus.add(2);
        facteursPremiersAttendus.add(3);

        List<Integer> facteursPremiers = FacteursPremiers.generate(nb);
        assertEquals (facteursPremiersAttendus, facteursPremiers);
    }

    @Test
    void generate_avec_deux_renvoie_liste_avec_deux_deux_deux () {
        int nb = 8;

        List<Integer> facteursPremiersAttendus = new ArrayList<>();
        facteursPremiersAttendus.add(2);

        List<Integer> facteursPremiers = FacteursPremiers.generate(nb);
        assertEquals (facteursPremiersAttendus, facteursPremiers);
    }

}