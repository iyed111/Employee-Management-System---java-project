import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static TableEmpDynamic table = new TableEmpDynamic();

    public static void main(String[] args) {
        int choix;

        do {
            System.out.println("\n -- MENU --");
            System.out.println("1 : Ajouter un employé");
            System.out.println("2 : Supprimer un employé");
            System.out.println("3 : Afficher les employés de l'entreprise");
            System.out.println("4 : Total des payes à verser");
            System.out.println("5 : Quitter");

            System.out.println("Entrez votre choix: ");
            choix = scan.nextInt();
            scan.nextLine();

            switch (choix) {
                case 1:
                    ajouterEmploye();
                    break;
                case 2:
                    supprimerEmploye();
                    break;
                case 3:
                    table.afficherEmpl();
                    break;
                case 4:
                    System.out.println("Total des payes: " + table.calculerTotalPaye());
                    break;
                case 5:
                    System.out.println("Au revoir!");
                    break;
                default:
                    System.out.println("Choix invalide, réessayez");
            }
        } while (choix != 5);

        scan.close();
    }

    // Method to add an employee
    private static void ajouterEmploye() {
        System.out.println("Type d'employé : ");
        System.out.println("1 : Employé simple");
        System.out.println("2 : Vendeur");

        int type = scan.nextInt();
        scan.nextLine();

        System.out.println("Entrer le matricule :");
        int matricule = scan.nextInt();
        scan.nextLine();

        System.out.println("Entrer le nom :");
        String nom = scan.nextLine();

        System.out.println("Entrer le nombre d'heures :");
        int nbHeur = scan.nextInt();

        System.out.println("Entrer le taux horaire :");
        float taux_h = scan.nextFloat();

        if (type == 1) {  // Employé simple
            Emploiyes e = new Emploiyes(matricule, nom, nbHeur, taux_h);
            table.ajouterEmpl(e);
        } else if (type == 2) {  // Vendeur
            System.out.println("Entrer le montant des ventes :");
            double ventes = scan.nextDouble();

            System.out.println("Entrer le pourcentage de commission :");
            double pourcentage = scan.nextDouble();

            Vendeur v = new Vendeur(matricule, nom, nbHeur, taux_h, ventes, pourcentage);
            table.ajouterEmpl(v);
        } else {
            System.out.println("Type invalide");
        }
    }

    
    private static void supprimerEmploye() {
        System.out.println("Entrez le rang de l'employé à supprimer (commençant à 0) :");
        int rang = scan.nextInt();
        table.supprimerEmpl(rang);
    }
}
