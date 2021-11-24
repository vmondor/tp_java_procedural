import java.util.Scanner;

public class Calcul { 
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la limite de la boucle : ");
        // String type = sc.getClass().getSimpleName();
        while(true){
            try {
                int chiffre = sc.nextInt();
                for(int i = 1; i <= chiffre; i++){
                    System.out.println(i + "\t" + i*i + "\t" + Math.sqrt(i));
                }
                break;
            } catch(Exception e){
                System.out.println("Merci de rentrer un chiffre !");
                sc = new Scanner(System.in);
                System.out.print("Entrez la limite de la boucle : ");
            }
        }

       
        sc.close();
    }
}
