package exercice;

import java.util.Scanner;

public class Exercice {

	public static void main(String[] args) {

		// Exercice 1
		// Ecrire un code Java qui permet d’afficher les nombres pairs compris entre 0
		// et 10

		// solution 1
		int[] listeChiffres = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int lc : listeChiffres) {
			if (lc % 2 == 0) {
				System.out.println(lc + " est un nombre pair");
			}
		}
		System.out.println("--------------------------------------------------------------------");
		// solution 2
		int[] listeNombres = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i <= listeNombres.length; i += 2) {
			System.out.println(listeNombres[i] + " est un nombre pair");
		}
		System.out.println("-------------------Fin exo 1---------------------------------");

		// Exercice 2
		// Ecrire un programme java qui demande à l’utilisateur de saisir
		// un nombre entier et de lui afficher que le nombre est pair ou
		// impair selon la valeur tapé

		Scanner scan = new Scanner(System.in);						// close effectué > no
		System.out.println("Tape un chiffre biloute");
		int tapedChiffre = scan.nextInt();

		if (tapedChiffre == 0) {
			System.out.println("Ce chiffre est ni pair ni impair, considé à la demande : positif");
		} else if (tapedChiffre % 2 == 0) { // pair
			if (tapedChiffre > 0) {
				System.out.println(tapedChiffre + " est pair et positif");
			} else {
				System.out.println(tapedChiffre + " est pair et négatif");
			}
		} else {                           // impair
			if (tapedChiffre < 0) {
				System.out.println(tapedChiffre + " est impair et Négatif");
			} else {
				System.out.println(tapedChiffre + " est impair et positif");
			}
		}
		
		System.out.println("-------------------Fin exo 2---------------------------------");

		// Exercice 3
//		Ecrire un programme java qui demande à l’utilisateur de saisir
//		3 nombre entier et qui indique à la fin du programme quelle 
//		chiffre est le plus grand
		
		Scanner scan2 = new Scanner(System.in);         			 // scan 2 close > no 
		
		System.out.println("Donne un chiffre bozo");
		int num1 = scan2.nextInt();
		System.out.println("Donne un autre chiffre bozo");
		int num2 = scan2.nextInt();
		System.out.println("Donne un dernier chiffre bozo");
		int num3 = scan2.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1 + " est le plus grand chiffre parmis les 3.");
		}else if (num2>num1 && num2>num3) {
			System.out.println(num2 + " est le plus grand chiffre parmis les 3.");
		}else {
			System.out.println(num3 + " est le plus grand chiffre parmis les 3.");
		}
		System.out.println("-------------------Fin exo 3---------------------------------");

		// Exercice 4
//		Écrire un programme Java pour convertir des minutes en un certain nombre
//		d'années et de jours
		
		Scanner scanMinute = new Scanner(System.in);             // not closed scan
		
		System.out.println("Entrer un nombre de minutes : ");
		double minutes = scanMinute.nextDouble();
		System.out.println("Tu as tapé " + minutes + " minutes. ");
		// passage minutes en année.s
		double years = minutes/525960;
		System.out.println("Ce qui donne " + years + " années.");
		double days = minutes/1440;
		System.out.println("Ce qui donne " + days + " jours.");
		
		System.out.println("-------------------Fin exo 4---------------------------------");

		// Exercice 5	
//		Ecrire un programme pour que pour un cours du dollar donné (et qui ne change
//		pas pendant l’exécution du programme),
//		on puisse convertir en euro.
//		Prévoyez un moyen d’arrêter l’exécution du programme.
		
		Scanner changeDollars = new Scanner(System.in);
		
		System.out.println(" Tapez votre montant en Euros :");
		double euros = changeDollars.nextDouble();
		double coursDollars = 1.0518;
		double dollars = euros * coursDollars;
		System.out.println("La somme de " + euros + "€ équivaut à : "+ dollars + " $");
		
	}
	
}
