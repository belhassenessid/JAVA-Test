package com.java.develop;
import java.util.Vector;
public class ListeEtudiants {
    Vector<Etudiant> collection;
    public ListeEtudiants(){
        collection=new Vector<Etudiant>();
    }
     public void ajouterEtudiant (Etudiant d) {
        collection.add(d);
    }
    public void supprimerEtudiant(Etudiant d) {
        if(collection.contains(d)) {
            collection.remove(d);
        }
    }
    public void updateEtudiantAt(double py, double uml, double test, double maths, int position) {
        collection.elementAt(position).setMoyPython(py);
        collection.elementAt(position).setMoyUML(uml);
        collection.elementAt(position).setMoyTest(test);
        collection.elementAt(position).setMoyMaths(maths);
    }
    public int NombreEtudiants() {
        return collection.size();
    }
    public void ajouterEtudiantAtPos(Etudiant d,int p) {
        collection.insertElementAt(d, p);
    }
    public void supprimerEtudiantAtPos(int p) {
        collection.removeElementAt(p);
    }  
    public Etudiant getEtudiantAt (int d) {
        return collection.elementAt(d);
    }
}