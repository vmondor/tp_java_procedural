package fr.afpa.outil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class UtilitaireBookstore {

	public static void main(String[] args) {
		
		System.out.println(isPretEnRetard(LocalDate.now().minusDays(10), LocalDate.now(),15));
//		System.out.println(isPretEnRetard(LocalDate.parse("2021-11-20"), LocalDate.now(),15));
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Date de naissance : ");
//		LocalDate dob = LocalDate.parse(sc.nextLine());
//		System.out.println("Vous avez " + getAge(dob, LocalDate.now()) + " ans");
//		sc.close();

		birthday();
	}
	
	public static boolean isPretEnRetard(LocalDate dateEmpruntEffective, LocalDate now, int dureeMaxPret) {
		
		LocalDate dateMaxSansRetard = dateEmpruntEffective.plusDays(dureeMaxPret);
		if(dateMaxSansRetard.isAfter(now)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int getAge(LocalDate dateNaiss, LocalDate now) {
		long diff = ChronoUnit.YEARS.between(dateNaiss, now);;
		int age = (int) diff;
		return age;
	}
	
	public static void birthday() {
	
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String dateNaiss = JOptionPane.showInputDialog("Date de naissance (dd-mm) ");
		LocalDate dob = LocalDate.parse(dateNaiss + "-2000", fmt);
		LocalDate today = LocalDate.now();
		int i = 0;
		
		while(true) {
			today = today.plusDays(1);
			i++;
			if(today.getMonthValue() == dob.getMonthValue() & today.getDayOfMonth() == dob.getDayOfMonth())
				break;
		}

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		String anniv = format.format(today);
		JOptionPane.showMessageDialog(null, "Votre anniversaire est dans " + i + " jours le " + anniv);
	}

}
