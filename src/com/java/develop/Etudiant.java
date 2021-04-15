package com.java.develop;
public class Etudiant extends Personne {
    private double MoyPython;
    private double MoyTest;
    private double MoyUML;
    private double MoyMaths;
    private String filiere;
    public Etudiant( String nom, String prenom,String filiere) {
        super( nom, prenom);
        this.setFiliere(filiere);
    }
        public Etudiant( String nom, String prenom, double MoyPython, double MoyTest, double MoyUML, double MoyMaths, String filiere) {
        super( nom, prenom);
        this.setMoyPython(MoyPython);
        this.setMoyTest(MoyTest);
        this.setMoyUML(MoyUML);
        this.setMoyMaths(MoyMaths);
        this.setFiliere(filiere);
    }
    public double MoyGen(){
        return (this.getMoyPython()+this.getMoyTest()+this.getMoyUML()+this.getMoyMaths())/4;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" / Filiere : "+filiere+" / Python= "+MoyPython+" Test="+MoyTest+" UML="+MoyUML+" Maths="+MoyMaths+" |==> MoyGen="+this.MoyGen();
    }
    public double getMoyPython() {
        return MoyPython;
    }
    public void setMoyPython(double moyPython) {
        MoyPython = moyPython;
    }
    public double getMoyTest() {
        return MoyTest;
    }
    public void setMoyTest(double moyTest) {
        MoyTest = moyTest;
    }
    public double getMoyUML() {
        return MoyUML;
    }
    public void setMoyUML(double moyUML) {
        MoyUML = moyUML;
    }
    public double getMoyMaths() {
        return MoyMaths;
    }
    public void setMoyMaths(double moyMaths) {
        MoyMaths = moyMaths;
    }
    public String getFiliere() {
        return filiere;
    }
    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
}
