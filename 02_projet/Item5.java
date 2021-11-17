import java.lang.Math;

public class Item5 {
    public static void main(String[] args){
        System.out.println("Racine carre de 4 : " + Math.sqrt(4));
        int min = 1;
        int max = 10;
        for(int i = 0; i < 5; i++){
            int nombreAleatoire = min + (int)(Math.random() * ((max - min) + 1));
            System.out.println(nombreAleatoire);
        }
    }

}
