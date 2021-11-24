import java.util.Scanner;

public class Version1 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String nom, prenom, adresse, carte;
        String chevaux[] = new String[3];
        char rep;

        do { 
            //SAISIE
            System.out.print("Nom du cavalier\t\t: ");
            nom = sc.nextLine();
            System.out.print("Prénom du cavalier\t: ");
            prenom = sc.nextLine();
            System.out.print("Adresse du cavalier\t: ");
            adresse = sc.nextLine();
            System.out.print("Chevaux preferes\t: ");
            for(int i = 0; i < 3; i++){
                chevaux[i] = sc.next();
                if(i < 2){
                    System.out.print("\t\t\t: ");
                }
            }
            sc.nextLine();
            System.out.print("No carte FNTE\t\t: ");
            carte = sc.nextLine();

            //PRESENTATION
            System.out.println("\n\nCavalier no " + carte);
            System.out.println("\t" + prenom + " " + nom.toUpperCase());
            System.out.println("\t" + adresse);
            System.out.print("\tChevaux :");
            for(int i = 0; i < chevaux.length; i++){
            System.out.print(" " + chevaux[i]);
            }

            //MESSAGE DE FIN
            do {
                System.out.print("\n\nVoulez-vous continuer (O/N) ?");
                rep = sc.nextLine().charAt(0);
            } while(!(rep == 'o' || rep == 'n' || rep == 'O' || rep == 'N'));
        } while (rep == 'o' || rep == 'O');
        sc.close();
    }
}
