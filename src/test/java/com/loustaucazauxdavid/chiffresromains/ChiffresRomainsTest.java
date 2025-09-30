package com.loustaucazauxdavid.chiffresromains;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChiffresRomainsTest {

    @Test
    void un_retourne_I()
    {
        String chiffreRomain = ChiffresRomains.convert(1);

        assertEquals("I", chiffreRomain);
    }

    @Test
    void vingt_retourne_XX()
    {
        String chiffreRomain = ChiffresRomains.convert(20);

        assertEquals("XX", chiffreRomain);
    }

    @Test
    void trente_neuf_retourne_XXXIX()
    {
        String chiffreRomain = ChiffresRomains.convert(39);

        assertEquals("XXXIX", chiffreRomain);
    }
}