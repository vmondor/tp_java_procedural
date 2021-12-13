import java.util.Scanner;

public class Version1 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String nom, prenom;
        char rep;

        do {
            //SAISIE
            System.out.println("Nom du cavalier\t: ");
            nom = sc.nextLine();
            System.out.println("Prénom du cavalier\t: ");
            prenom = sc.nextLine();
            
            //PRESENTATION
            System.out.print("\n\nCavalier : ");
            System.out.println("\t" + prenom + " " + nom);

            //MESSAGE DE FIN
            System.out.print("\n\nVoulez-vous continuer (O/N) ?");
            rep = sc.nextLine().charAt(0);
        } while (rep == 'o');
        sc.close();
    }
}