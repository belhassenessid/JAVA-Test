package com.java.develop;
public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private static int count;
    public Personne( String nom, String prenom) {
        this.id = ++count;
        this.nom = nom;
        this.prenom = prenom;
    }
    @Override
    public String toString() {
        /* TODO Auto-generated method stub */
        return "ID:"+id+", "+nom+" "+prenom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Personne.count = count;
    }
}