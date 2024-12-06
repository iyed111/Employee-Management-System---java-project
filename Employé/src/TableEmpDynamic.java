import java.util.ArrayList;

public class TableEmpDynamic {
    private ArrayList<Emploiyes> emploiyes ;

    public TableEmpDynamic(){
        emploiyes = new ArrayList<>();
    }

    public void ajouterEmpl(Emploiyes e){
        emploiyes.add(e);
    }

    public void supprimerEmpl(int rang){
        if(rang >=0 && rang <emploiyes.size()){
            emploiyes.remove(rang);
        }
        else{
            System.out.println("rang invalide .");
        }
    }

    public void afficherEmpl(){
        for(Emploiyes e : emploiyes){
            e.afficherInfo();
        }
    }

    public double calculerTotalPaye(){
        double total = 0.0 ;
        for(Emploiyes e : emploiyes){
            total = total + e.calculPay();
        }
        return total ;
    }

}
