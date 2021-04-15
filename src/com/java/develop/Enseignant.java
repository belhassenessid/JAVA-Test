package com.java.develop;

public class Enseignant extends Personne{

    private String matiere;
    private double salaire;


    public Enseignant(String nom, String prenom, double salaire, String matiere) {
        super( nom, prenom);
        this.setSalaire(salaire);
        this.matiere = matiere;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" prof de "+matiere+" salaire="+salaire;
    }


    public String getMatiere() {
        return matiere;
    }


    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }


	public double getSalaire() {
		return salaire;
	}


	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
