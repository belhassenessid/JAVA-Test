package com.java.test;

import com.java.develop.Etudiant;
import com.java.develop.ListeEtudiants;

import junit.framework.*;

public class EtudiantTest extends TestCase {
	
	Etudiant tous_les_etudiants[] = new Etudiant[3]; //liste de tous les etudiants
	ListeEtudiants CS =new ListeEtudiants(); //liste des étudiants du filière CS
	ListeEtudiants IRS =new ListeEtudiants(); //liste des étudiants du filière IRS
	
	
	public void test() throws Exception {	
		
	// TEST Constructor	
	// tester que les étudiants sont construits et qu'ils sont bien ajoutés à l'ensemble des étudiants
	tous_les_etudiants[0] = new Etudiant("Ali","Ben Ali","Python");
	tous_les_etudiants[1] = new Etudiant("Asma","Farhat","Python");
	tous_les_etudiants[2] = new Etudiant("Med","Ayari","Maths");
	
	assertNotNull(tous_les_etudiants[0]);
	assertNotNull(tous_les_etudiants[1]);
	assertNotNull(tous_les_etudiants[2]); 
	
	// TEST d'ajout
	// tester que les étudiants peuvent etre bien ajoutés à leurs listes de filière (Python/Maths)
	CS.ajouterEtudiant(tous_les_etudiants[0]);
	CS.ajouterEtudiant(tous_les_etudiants[1]);
	IRS.ajouterEtudiant(tous_les_etudiants[2]);
	
	assertEquals(CS.getEtudiantAt(0).getFiliere(),"Python");
	assertEquals(IRS.getEtudiantAt(0).getFiliere(),"Maths");
	
	// TEST de suppression
	CS.supprimerEtudiant(tous_les_etudiants[1]);
	assertEquals(CS.NombreEtudiants(),1); //si la suppression est réussie, le nombre d'étudiants Python doit être 2-1==1
	
	// Test update && Saisie de notes
	// tester que nous pouvons modifier les étudiants en leur ajoutant de nouvelles notes
	CS.updateEtudiantAt(15.50, 16.75, 07.25, 18.25,  0);
	IRS.updateEtudiantAt(13.50, 19.50, 10.50, 08.75,  0);
	
	assertEquals(CS.getEtudiantAt(0).MoyGen() , (15.50+16.75+07.25+18.25)/4);
	assertEquals(IRS.getEtudiantAt(0).MoyGen() , (13.50+19.50+10.50+08.75)/4);
	
	// Test Affichage des moyennes des matieres, statistiques -calcule moyenne gen- et quelques autres options -id, non et prenom
	assertEquals(CS.getEtudiantAt(0).toString() , "ID:1, Ali Ben Ali / Filiere : Python / Python= 15.5 Test=7.25 UML=16.75 Maths=18.25 |==> MoyGen=14.4375");
	

	
	}

	
	
}

