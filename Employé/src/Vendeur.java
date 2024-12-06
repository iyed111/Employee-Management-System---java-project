public class Vendeur extends Emploiyes{
    private double ventes ;
    private double pourcentage;


    Vendeur(){
        super();
        this.ventes = 0 ;
        this.pourcentage =0 ;
    }

    Vendeur(int matricule , String nom ,int nbHeur, float taux_h , double ventes , double pourcentage){
        super(matricule , nom , nbHeur , taux_h);
        this.ventes = ventes;
        this.pourcentage = pourcentage ;
    }

    public void setVentes(double ventes){
        this.ventes = ventes ;
    }
    public double getVentes (){
        return ventes ;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }
    public double getPourcentage() {
        return pourcentage;
    }

    @Override
    public double calculPay(){
        return super.calculPay()+(ventes*pourcentage);      //calcule de paye avec commission
    }

    @Override
    public void afficherInfo(){
        super.afficherInfo();       /*les info mta3 lemployes l3adi + les infos jdod*/
        System.out.println("ventes :" + ventes + " poucentage :" + pourcentage);

    }

}

