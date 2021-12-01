package fr.afpa.util;

import javax.swing.JOptionPane;
import fr.afpa.math.Math;

public class CalculFactor {

	public static void main(String[] args) throws IllegalArgumentException {
		boolean flag = true;
		do {
			String str = JOptionPane.showInputDialog("Entrez un nombre");

			try {
				long number = Long.parseLong(str);
				System.out.println(Math.factorielle(number));
				flag = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Merci de rentrer un nombre");
				flag = false;
			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Merci de rentrer un nombre inférieur à 21");
				flag = false;
			} catch (StackOverflowError e) {
				JOptionPane.showMessageDialog(null, "Merci de rentrer un nombre supérieur à -1");
				flag = false;
			}
		} while (!flag);

		System.out.println("Le programme continue");
	}

}
