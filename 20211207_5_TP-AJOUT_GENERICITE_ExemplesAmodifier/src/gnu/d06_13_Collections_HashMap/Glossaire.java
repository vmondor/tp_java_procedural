
package gnu.d06_13_Collections_HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

class Glossaire
{
  public static void main(String[] args)
  {
    String  definitionInstance   = "Objet cr\u00e9\u00e9 \u00e0 partir d'une classe.";
    String  definitionCollection = "Instance d'une classe g\u00e9rant "
                                   + "un ensemble d'\u00e9l\u00e9ments.";
    String  definitionSousClasse = "Classe h\u00e9ritant d'une autre classe.";
    // Remplissage du glossaire
    // HashMap<String, String> glossaire = new HashMap<>();
    HashMap<String, String> glossaire = (HashMap<String, String>)new HashMap<String, String>();
    glossaire.put ("instance", definitionInstance);
    glossaire.put ("collection", definitionCollection);
    // sous classe et classe derivee ont la meme definition
    glossaire.put ("sous classe", definitionSousClasse);
    glossaire.put ("classe d\u00e9riv\u00e9e", definitionSousClasse);
    HashMap<String, String> glossaireCopy = (HashMap<String, String>) glossaire.clone();
    List<String> glossaireCopyByKey = new ArrayList<>(glossaireCopy.keySet());
    Collections.sort(glossaireCopyByKey);
    System.out.println(glossaireCopyByKey);
    while (true)
    {
      // Saisie de la recherche
      String recherche = JOptionPane.showInputDialog ("Que cherchez-vous ?");
      // Si l'utilisateur choisit Annuler recherche est egal a null
      if (recherche == null)
        System.exit (0);

      // Recherche de la definition
      	//String definition = (String)glossaire.get (recherche.toLowerCase());
      // Retirer le down-casting
      String definition = glossaire.get(recherche.toLowerCase());
      
      
      // Affichage avec des icones differentes suivant le resultat de la recherche
      if (definition != null)
        JOptionPane.showMessageDialog(null, recherche + " : " + definition,
                      "R\u00e9sultat de la recherche", JOptionPane.INFORMATION_MESSAGE);
      else
        JOptionPane.showMessageDialog(null, recherche + " non d\u00e9fini dans le glossaire",
                      "R\u00e9sultat de la recherche", JOptionPane.WARNING_MESSAGE);
    }
    
    
  }
}
