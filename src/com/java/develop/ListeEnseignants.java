package com.java.develop;
import java.util.Vector;
public class ListeEnseignants {
	    Vector<Enseignant> collection;
	    public ListeEnseignants(){
	        collection=new Vector<Enseignant>();
	    }  
	    public void ajouterEnseignant (Enseignant d) {
	        collection.add(d);
	    }
	    public void supprimerEnseignant(Enseignant d) {
	        if(collection.contains(d)) {
	            collection.remove(d);
	        }
	    }
	    public void updateEnseignantAt(String matiere, double salaire, int position) {
	        collection.elementAt(position).setMatiere(matiere);
	        collection.elementAt(position).setSalaire(salaire);
	    }
		    public int NombreEnseignants() {
	        return collection.size();
	    }
	    public void ajouterEnseignantAtPos(Enseignant d,int p) {
	        collection.insertElementAt(d, p);
	    }
	    public void supprimerEnseignantAtPos(int p) {
	        collection.removeElementAt(p);
	    }
	    public Enseignant getEnseignantAt (int d) {
	        return collection.elementAt(d);
	    }
}
