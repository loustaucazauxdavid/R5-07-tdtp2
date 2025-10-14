package com.loustaucazauxdavid.panier;

import java.util.HashMap;
import java.util.Map;

public class Panier {
    private Map<Produit, Integer> _articles;

    Panier() {
        _articles = new HashMap<>();
    }

    public void ajouterProduit (Produit produit, Integer quantite)
    {
        Integer qteActuelleDansPanier = _articles.get(produit);

        // Pas déjà dans le panier
        if (!_articles.containsKey(produit))
        {
            _articles.put(produit, quantite);
            return;
        }

        // Déjà dans la panier, incrémenter
        _articles.replace(produit, qteActuelleDansPanier + quantite);
    }

    public void supprimerArticle (Produit produit, Integer quantiteAEnlever)
    {
        // Pas dans le panier
        if (!_articles.containsKey(produit)) {
            return;
        }

        Integer qteActuelleDansPanier = _articles.get(produit);

        if (qteActuelleDansPanier - quantiteAEnlever <= 0) {
            // enlever l'article tout court
            _articles.remove(produit);
        }
        else
        {
            // update avec nouvelle valeur
            _articles.replace(produit, qteActuelleDansPanier - quantiteAEnlever);
        }
    }

    public void viderPanier()
    {
        _articles.clear();
    }

    public float calculerPrix() {
        float prixPanier = 0;

        for (Produit article : _articles.keySet()) {
            prixPanier += article.getPrix()       // Prix
                    * _articles.get(article); // Qte
        }

        return prixPanier;
    }

    @Override
    public String toString()
    {
        String str = "";

        for  (Produit article : _articles.keySet()) {
            str += "<" + article.getNom() + "," + article.getPrix() + "> \n";
        }

        return str;
    }
}
