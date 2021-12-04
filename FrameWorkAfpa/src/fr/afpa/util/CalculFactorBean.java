package fr.afpa.util;

import java.math.BigInteger;
import java.util.Scanner;

import javax.swing.JOptionPane;

import fr.afpa.math.MathBean;

public class CalculFactorBean {

	public static void main(String[] args) throws IllegalArgumentException {
		MathBean mathBean = new MathBean();
		boolean flag = true;
		String str;
		do {
			str = JOptionPane.showInputDialog("Entrez un nombre (long)");
			
			if(str != null) {
				
				try {
					long number = Long.parseLong(str);
					System.out.println("Factorielle : " + mathBean.factorielle(number));
					flag = true;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Merci de rentrer un nombre");
					flag = false;
				} catch (IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null, "Merci de rentrer un nombre inf�rieur � 21");
					flag = false;
				} catch (StackOverflowError e) {
					JOptionPane.showMessageDialog(null, "Merci de rentrer un nombre sup�rieur � -1");
					flag = false;
				}
			}
			else {
				flag = true;
			}
		} while (!flag);
		
		System.out.println("Le programme continue");
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un nombre (Big) : ");
		BigInteger chiffre = new BigInteger(sc.nextLine());
		try {
			System.out.println(mathBean.factorielleBig(chiffre));
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Merci de rentrer un nombre");
		} catch(StackOverflowError e) {
			JOptionPane.showMessageDialog(null, "Dépassement de capacité");
		}
		sc.close();
	}

}
