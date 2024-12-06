public class Emploiyes {
    private int matricule ;
    private String nom ;
    private int nbHeur ;
    private float taux_h ;


    Emploiyes(){
        this.matricule=0 ;
        this.nom=" " ;
        this.nbHeur=0;
        this.taux_h=0;
    }

    Emploiyes(int matricule , String nom , int nbHeur , float taux_h){
        this.matricule = matricule ;
        this.nom = nom ;
        this.nbHeur = nbHeur ;
        this.taux_h = taux_h ;

    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }
    public int getMatricule() {
        return matricule;
    }

    public void setNom(String nom){
        this.nom = nom ;
    }
    public String getNom(){
        return nom ;
    }

    public void setNbHeur(int nbHeur){
        this.nbHeur = nbHeur ;
    }
    public int getNbHeur(){
        return nbHeur ;
    }

    public void setTaux_h(float taux_h) {
        this.taux_h = taux_h;
    }

    public float getTaux_h() {
        return taux_h;
    }


    public double calculPay(){
        return nbHeur*taux_h ;
    }

    public void afficherInfo(){
        System.out.println("matricule : " + matricule + " nom :" + nom + " nb heures : " + nbHeur + "taux horire " + taux_h);
    }
}
