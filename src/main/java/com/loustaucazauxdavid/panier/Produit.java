package com.loustaucazauxdavid.panier;

public class Produit {
    private String _nom;
    private float _prix;

    public Produit(String nom, float prix) {
        _nom = nom;
        _prix = prix;
    }

    public String getNom()
    {
        return _nom;
    }

    public void setNom(String nom)
    {
        _nom = nom;
    }

    public float getPrix()
    {
        return _prix;
    }

    public void setPrix(float prix)
    {
        _prix = prix;
    }

    public boolean equals(Produit produit)
    {
        return (produit.getPrix() == this.getPrix() &&
                produit.getNom().equals(this.getNom()));
    }
}
