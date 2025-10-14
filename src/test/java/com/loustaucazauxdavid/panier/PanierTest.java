package com.loustaucazauxdavid.panier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PanierTest {

    @Test
    void panier_vide_renvoie_vide() {
        Panier panier = new Panier();

        assertEquals(0, panier.calculerPrix());
    }

    @Test
    void panier_une_banane_renvoie_1euro50() {
        Panier panier = new Panier();
        Produit produit = new Produit("banane", 1.50F);

        panier.ajouterProduit(produit, 1);

        float expectedPrix = 1.50F;
        assertEquals(expectedPrix, panier.calculerPrix());
    }

    @Test
    void panier_deux_bananes_1euro50_et_1euro_renvoie_2euros50() {
        Panier panier = new Panier();

        Produit banane1 = new Produit("banane", 1.00F);
        Produit banane2 = new Produit("banane", 1.50F);

        panier.ajouterProduit(banane1, 1);
        panier.ajouterProduit(banane2, 1);

        float expectedPrix = 2.50F;
        assertEquals(expectedPrix, panier.calculerPrix());
    }

    @Test
    void panier_deux_bananes_1euro50_renvoie_2euros50() {
        Panier panier = new Panier();

        Produit banane1 = new Produit("banane", 1.50F);

        panier.ajouterProduit(banane1, 2);

        float expectedPrix = 3.00F;

        System.out.println(panier.toString());
        assertEquals(expectedPrix, panier.calculerPrix());
    }

    @Test
    void panier_deux_bananes_1euro50_1euro_renvoie_2euros50() {
        Panier panier = new Panier();

        Produit banane1 = new Produit("banane", 1.50F);
        Produit banane2 = new Produit("banane", 1.00F);

        panier.ajouterProduit(banane1, 2);
        panier.ajouterProduit(banane2, 1);

        float expectedPrix = 4.00F;

        System.out.println(panier.toString());
        assertEquals(expectedPrix, panier.calculerPrix());
    }

    @Test
    void panier_une_banane_supprimer_renvoie_vide() {
        Panier panier = new Panier();
        Produit produit = new Produit("banane", 1.50F);

        panier.ajouterProduit(produit, 1);
        panier.supprimerArticle(produit, 1);

        float expectedPrix = 0.00F;
        assertEquals(expectedPrix, panier.calculerPrix());
    }

    @Test
    void panier_trois_bananes_supprimer_deux_renvoie_1euro50() {
        Panier panier = new Panier();
        Produit produit = new Produit("banane", 1.50F);

        panier.ajouterProduit(produit, 3);
        panier.supprimerArticle(produit, 2);

        float expectedPrix = 1.50F;
        assertEquals(expectedPrix, panier.calculerPrix());
    }

    @Test
    void panier_deux_bananes_un_chocolat_supprimer_bananes_renvoie_10euros() {
        Panier panier = new Panier();
        Produit produit1 = new Produit("banane", 1.50F);
        Produit produit2 = new Produit("chocolat", 10.00F);

        panier.ajouterProduit(produit1, 2);
        panier.ajouterProduit(produit2, 1);

        panier.supprimerArticle(produit1, 2);

        float expectedPrix = 10.00F;
        assertEquals(expectedPrix, panier.calculerPrix());
    }

    @Test
    void vider_panier_vide_renvoie_vide() {
        Panier panier = new Panier();

        panier.viderPanier();

        float expectedPrix = 0.00F;
        assertEquals(expectedPrix, panier.calculerPrix());
    }

    @Test
    void vider_panier_deux_bananes_un_chocolat_renvoie_vide() {
        Panier panier = new Panier();

        Produit produit1 = new Produit("banane", 1.50F);
        Produit produit2 = new Produit("chocolat", 10.00F);

        panier.ajouterProduit(produit1, 2);
        panier.ajouterProduit(produit2, 1);

        panier.supprimerArticle(produit1, 2);
        panier.supprimerArticle(produit2, 1);

        float expectedPrix = 0.00F;
        assertEquals(expectedPrix, panier.calculerPrix());
    }

}