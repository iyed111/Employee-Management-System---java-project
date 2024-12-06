public class TableEmp {
    private Emploiyes[] emploiyes;
    private int count ;

    public TableEmp (int taille){
        emploiyes = new Emploiyes[taille];
        count = 0 ;
    }

    public void ajouterEmp(Emploiyes e){
        if(count < emploiyes.length){
            emploiyes[count ++]= e ;
        }
        else{
            System.out.println("table pleine , ajout impossible");
        }

    }

    public void supprimerEmp(int rang){
        if(rang >=0 && rang <count){
            for(int i =rang ; i < count -1 ; i++){
                emploiyes[i] = emploiyes[i+1];
                emploiyes[--count]= null ;
            }
        }
        else{
            System.out.println("rang invalide");
        }
    }

    public void afficherEmp(){
        for(int i =0 ; i < count ; i++){
            emploiyes[i].afficherInfo();
        }
    }

    public double calculerTltalPaye(){
        double total =0.0 ;
        for(int i=0 ; i < count ; i++ ){
            total = total +emploiyes[i].calculPay() ;
        }
        return total ;
    }



}
