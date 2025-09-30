package com.loustaucazauxdavid.personnage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {

    @Test
    void renvoi_null_si_tourner_pas_inf_a_un() {
        Personnage personnage = new Personnage(Personnage.Direction.NORD);

        String newDirStr = personnage.tourner(-1);

        assertNull(newDirStr);
    }

    @Test
    void nord_tourne_est() {
        Personnage personnage = new Personnage(Personnage.Direction.NORD);

        String newDirStr = personnage.tourner(1);

        assertEquals("EST", newDirStr);
    }

    @Test
    void est_tourne_sud() {
        Personnage personnage = new Personnage(Personnage.Direction.EST);

        String newDirStr = personnage.tourner(1);

        assertEquals("EST", newDirStr);
    }

    @Test
    void sud_tourne_ouest() {
        Personnage personnage = new Personnage(Personnage.Direction.SUD);

        String newDirStr = personnage.tourner(1);

        assertEquals("EST", newDirStr);
    }

    @Test
    void ouest_tourne_sud() {
        Personnage personnage = new Personnage(Personnage.Direction.OUEST);

        String newDirStr = personnage.tourner(1);

        assertEquals("EST", newDirStr);
    }


}