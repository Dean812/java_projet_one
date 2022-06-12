package exercice_prof;

import java.util.Scanner;

public class ExoVersProf {
	
	public static void main(String[] args) {
	}

	// Creation d'une methode simple representant une serie d'instruction,
	// n'echangeant pas d'informations avec le programme
	// Une methode non statique est une methode qui utilise une nouvelle instance
	// d'objet, ici Main
	public void exo1() {
		// Ecrire un code Java qui permet d’afficher les nombres pairs compris entre 0
		// et 10. (value % 2 == 0)
		for (int nu = 0; nu < 10; nu += 2) {
			System.out.println(nu);
		}
	}

	// Creation d'une methode simple representant une serie d'instruction,
	// n'echangeant pas d'informations avec le programme
	// une methode statique est une methode qui n'as pas d'instance, cad, qu'elles
	// peuvent etre utilisee sans instancier un objet de la classe, ici Main
	public static void exo2() {
		// Ecrire un programme java qui demande à l’utilisateur de saisir
		// un nombre entier et de lui afficher que le nombre est pair ou
		// impair selon la valeur tapé
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("Input number: ");
			int input = in.nextInt();
			if (input % 2 == 0) {
				System.out.println("Number is odd");
			} else {
				System.out.println("Number is even");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void exo3() {
		Scanner scanner2 = new Scanner(System.in);
		try {

			System.out.print("Input the 1st number: ");
			int num1 = scanner2.nextInt();
			System.out.print("Input the 2nd number: ");
			int num2 = scanner2.nextInt();
			System.out.print("Input the 3rd number: ");
			int num3 = scanner2.nextInt();

			// avec la classe Math.max
			int num = Math.max(num1, num2);
			num = Math.max(num, num3);

			System.out.println("The greatest :" + num);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void exo4() {
		// Écrire un programme Java pour convertir des minutes en un certain nombre
		// d'années et de jours
		double minutesInYear = 60 * 24 * 365;
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		double min = input.nextDouble();
		long years = (long) (min / minutesInYear);
		int days = (int) (min / 60 / 24) % 365;
		System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
	}

	public static void exo5() {
		// Ecrire un programme pour que pour un cours du dollar donné (et qui ne change
		// pas pendant l’exécution du programme),
		// on puisse convertir en euro.
		// Prévoyez un moyen d’arrêter l’exécution du programme.
		double euros, dollar;
		double cours;
		String choix;
		Scanner in = new Scanner(System.in);
		try {
			do {
				System.out.println("Cours du dollar(valeur de 1 dollar)?");
				cours = in.nextDouble();
				System.out.println("Somme en dollar ?");
				dollar = in.nextDouble();
				euros = dollar * cours;
				System.out.println("La somme en euros:" + euros);
				System.out.println("Voulez-vous quitter" + "(tapez q pour quitter)");
				choix = in.next();
			} while (choix == "q");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
