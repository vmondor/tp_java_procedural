package fr.afpa.outil;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.swing.JOptionPane;

public class VacancesHorsWeekEnd {

	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("Année recherchée :");
		int annee = Integer.parseInt(data);

		MonthDay[] joursFeriesMobiles = new MonthDay[8];
		joursFeriesMobiles[0] = MonthDay.of(1, 1);// jour de l'an
		joursFeriesMobiles[1] = MonthDay.of(5, 1);// Fête du travail
		joursFeriesMobiles[2] = MonthDay.of(5, 8);// La victoire
		joursFeriesMobiles[3] = MonthDay.of(7, 14);// fête nationale
		joursFeriesMobiles[4] = MonthDay.of(8, 15);// L'Assomption
		joursFeriesMobiles[5] = MonthDay.of(11, 1);// La Toussaint
		joursFeriesMobiles[6] = MonthDay.of(11, 11);// L'Armistice
		joursFeriesMobiles[7] = MonthDay.of(12, 25);// Noël

		int nbJours = 3;
		LocalDate dateComplete;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern( "EEEE dd MMMM uuuu" , Locale.FRENCH );

		for (MonthDay jour : joursFeriesMobiles) {
			dateComplete = jour.atYear(annee);
			if(dateComplete.getDayOfWeek() == DayOfWeek.SATURDAY
					| dateComplete.getDayOfWeek() == DayOfWeek.SUNDAY) {
				continue;
			}
			else {
				nbJours++;
			}
		}
		StringBuilder tab = new StringBuilder();
		tab.append("Calendrier français des jours fériés de 2021 (" + nbJours + " jours hors week end):\n"
				+ "\nJours fériés fixes :"
				+ "\nLundi de pâques"
				+ "\nJeudi de l'ascension"
				+ "\nLundi de pentecôte\n"
				+ "\nJours fériés mobiles :\n");
		for(MonthDay jour : joursFeriesMobiles) {
			dateComplete = jour.atYear(annee);
			LocalDate day = LocalDate.of( annee , dateComplete.getMonth(), dateComplete.getDayOfMonth());
			String dayString = day.format( fmt );
			tab.append(dayString + "\n");
		}
		

			JOptionPane.showMessageDialog(null,tab);
	
		
	}

}

