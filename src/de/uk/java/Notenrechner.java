package de.uk.java;

public class Notenrechner {

	public static void main(String[] args) {
		int erreichtePunktzahl = 50;
		int maximalePunktzahl = 172;
		
		// Errechne in Java die erreichten Prozente
		double erreichteProzente = ((double)erreichtePunktzahl / maximalePunktzahl) * 100;
		System.out.println(erreichteProzente);
		
		// if-Block. In den Klammern steht die condition, die entweder wahr oder falsch sein muss
		if (erreichteProzente < 50) {
			System.out.println("Nicht bestanden! 6");
		} else if (erreichteProzente >= 50 && erreichteProzente < 70) {
			System.out.println("Bestanden! 4");
		}
	}
}
