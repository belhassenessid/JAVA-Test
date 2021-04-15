package com.java.test;

import com.java.develop.Enseignant;
import com.java.develop.ListeEnseignants;

import junit.framework.*;

public class EnseignantTest extends TestCase {
	
	Enseignant tous_les_enseignants[] = new Enseignant[3]; //liste de tous les profs
	ListeEnseignants Python =new ListeEnseignants(); //liste des profs de Python
	ListeEnseignants Maths =new ListeEnseignants(); //liste des profs de Mtahs
	
	
	public void test() throws Exception {	
		
	// TEST Constructor	
	// tester que les profs sont construits et qu'ils sont bien ajoutés à l'ensemble des profs
	tous_les_enseignants[0] = new Enseignant("Salim","Abidi",2089,"Python");
	tous_les_enseignants[1] = new Enseignant("Rahma","Ayari",3155,"Python");
	tous_les_enseignants[2] = new Enseignant("Salwa","Barberi",1600,"Maths");
	
	assertNotNull(tous_les_enseignants[0]);
	assertNotNull(tous_les_enseignants[1]);
	assertNotNull(tous_les_enseignants[2]); 
	
	// TEST d'ajout
	// tester que les profs peuvent etre bien ajoutés à leurs listes de matieres (Python/Maths)
	Python.ajouterEnseignant(tous_les_enseignants[0]);
	Python.ajouterEnseignant(tous_les_enseignants[1]);
	Maths.ajouterEnseignant(tous_les_enseignants[2]);
	
	assertEquals(Python.getEnseignantAt(0).getMatiere(),"Python");
	assertEquals(Maths.getEnseignantAt(0).getMatiere(),"Maths");
	
	// TEST de suppression
	Python.supprimerEnseignant(tous_les_enseignants[1]);
	assertEquals(Python.NombreEnseignants(),1); //si la suppression est réussie, le nombre de profs de Python doit être 2-1==1
	
	// Test update && Saisie de notes
	// tester que nous pouvons modifier les profs en leur ajoutant +100 dt dans le salaire et en inversant les matieres
	Python.updateEnseignantAt("Maths",2189,  0);
	Maths.updateEnseignantAt("Python",1700,  0);
	
	System.out.print(tous_les_enseignants[0].toString());
	assertEquals(Python.getEnseignantAt(0).getSalaire() , 2189.0);
	assertEquals(Maths.getEnseignantAt(0).getSalaire() , 1700.0);
	
	// Test Affichage de salaire, matieres et quelques autres options -id, non et prenom
	assertEquals(Python.getEnseignantAt(0).toString() , "ID:1, Salim Abidi prof de Maths salaire=2189.0");
	
	
	}

	
	
}

