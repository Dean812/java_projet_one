package main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// cmd eclipse
		// commenter/decommenter : CTRL + shilt + C
		// indenter : CTRL + shilt + F

		// Represente la methode principale, d'entree / sortie de notre programme
		// Il ne peut y avoir qu'une methode [...] main(String[] args) dans une
		// application

		System.out.print("Hello print() !"); // <-- ce n'est pas un println
		System.out.println("Hello ... !");
		System.out.println("Hello println() !");

		String hello = "Hello";
		System.out.println(hello);

		int x = 5;
		System.out.println(x);
		Integer y = 6;
		System.out.println(y);

		System.out.println("------------------------------------------------------------------");

		// replace(old,new) : permet de remplacer toute occurrence de la chaıne old
		// dans la chaıne courante par new et retourne la nouvelle chaıne
		String str = "bonjour les bons jours";
		String str2 = str.replace("jour", "soir");
		System.out.println(str2);

		System.out.println("------------------------------------------------------------------");

		// indexOf(x) : retourne l’indice de la premiere occurrence de la valeur de x
		// dans la chaıne, -1 sinon.
		Integer position1 = str.indexOf("bon");
		System.out.println(position1); // Affiche 0

		int position2 = str.indexOf("bon", 3);
		System.out.println(position2); // Affiche 12

		// Plusieurs méthodes pour tourner un int en string
		Integer z = 22;
//		String str3 = z.toString();
//		ou
		String str3 = ((Integer) z).toString(); // ici avec un casting
		System.out.println(str3);

		int v = 2; // casting avec un primitif et pas un objet
		String str4 = ((Integer) v).toString();
		System.out.println(str4); // Affiche "2"

		int w = 4; // autre manière de gérer le int en string
		String str5 = Integer.toString(w);
		System.out.println(str5);

		int trob = 5; // semble marcher avec int et integer
		String strobs = String.valueOf(trob);
		System.out.println(strobs);

		// convertire en string
		String string = "8";
		byte g = Byte.parseByte(string);
		System.out.println(g + " : i'm a String now");

		System.out.println("------------conversion entre type +/- proche ----------------------");

		// Pas besoin de convertir un type primitif vers son type Objet / Wrapper
		Integer n = 2;
		int m = n;
		System.out.println(m);

		int k = 3;
		Integer j = k;
		System.out.println(j);

		System.out.println("---------------pre/post incrémentation-------------------");

		// += >> f = i = i + 2
		int i = 5;
		int f = i += 2; // => i = i + 2

		System.out.println(i); // Affiche 7
		System.out.println(f); // Affiche 7

		// Pre-incrementation - directement prit en compte
		int a = 2;
		int b = ++a;

		System.out.println(a); // Affiche 3
		System.out.println(b); // Affiche 3

		// Post-incrementation
		int c = 2; // rappel i = 7
		int d = i += 2; // => i = i + 2

		System.out.println("affiche i :" + i); // Affiche 3
		System.out.println("affiche d :" + d); // Affiche 2

		// my own version de l'expliation ▼ avec ++
		int inti = 0;
		int intj = 10;
		inti = intj++;
		System.out.println(intj); // Affiche 11
		System.out.println(inti); // Affiche 10
		// résultat , c'est l'incrémenter qui prend la valeur, mais pas la valeur dans
		// lequel on insert le calcule, on insert dans inti mais init reste a 10.

//		très bonne exemple dans mon evernote - Orsys > java8 cours vocabulaire ▼ 
		System.out.println("Exemple clair de post incrémentation : ");
		int intJ = 10;
		int intK = 11;
		int intZ = (intJ++) + (++intK);
		System.out.println("Le résultat est intZ = " + intZ);
		System.out.println("Alors qu intJ et intK sont égales à : intJ = " + intJ + " ; et intK = " + intK + " .");

		System.out.println("------------------------------------------------------------------");

		System.out.println("bon" + " " + "jour");

		int num1 = 3;
		int num2 = 5;
		int result = num1 + num2;
		System.out.println(result);

		System.out.println("------------------------------------------------------------------");

		float floatNum = 4.95f;
		System.out.println(floatNum);

		char myChar = 'F';
		System.out.println(myChar);

		boolean bool = true;
		System.out.println(bool);

		int num3 = 100000;
		System.out.println(num3);

		long numLong = 1000000000L;
		System.out.println(numLong);

		double dble = 100.99d;
		System.out.println(dble);

		System.out.println(
				"-------------------Next , le scanner : rentrer une valeur dans la console-------------------------------------");

		Scanner scannette = new Scanner(System.in); // ne pas oublier l'import

		System.out.println("Veuillez insérer un chiffre :"); // mettre ce sysout avant la suite, sinon le message ne se
																// voit qu'après
//		int scani = scannette.nextInt();
//		System.out.println("la valeur inserée est : "+scani);
//		scannette.close(); // ne pas oublier le close().    si on close mais que l'on prévoit d'utiliser d'autres scanner, do not close the first ones

		Scanner scan = new Scanner(System.in); // 2 scan d'affiler fait bugger sauf si on close pas les précédents.

		System.out.println("Rentre ton prénom : ");
//		String scanName = scan.next(); // chaine , 1 mot max , pour une phrase nextLine()
//		System.out.println("Je m'appelle " + scanName);
//		scan.close();

		Scanner scanChar = new Scanner(System.in);

		System.out.println("rentrez un simple caractères, du type : a , ç , ? , and so on");
//		char scanC = scanChar.next().charAt(4);  // on peut marquer ce que l'on veut, ca ne prendra que le caractère 
//		System.out.println(scanC);       //  choisi via .charAt( ici  ) si on met 4 avec le mot super > résultat > r   

		// scan.close();scannette.close();scanChar.close(); // bonne pratique ? je close
		// tout les scanners

//		nous avons vue 2 types de type pour le Scanner , il en exite d'autres

		System.out.println("-------------------scanner and try catch -------------------------------------");

		Scanner scanTest = new Scanner(System.in);

		System.out.println("Veuillez insérer une chiffre :");
		try {
			int scanTry = scanTest.nextInt(); // Si un message d'erreur arrive ici, par ex, dans le cas ou l'on insere
												// une lettre
			System.out.println("la valeur inserée est : " + scanTry);
		} catch (Exception e) {
			System.out.println("prout");
		}
		// il existe de nombreuses exeptions
		// https://programming.guide/java/list-of-java-exceptions.html

		// Scanner avec try catch and print F ▼

//		try (Scanner scanner = new Scanner(System.in)) {
//
//			System.out.println("Veuillez saisir un premier entier, svp ?");
//			int n1 = scanner.nextInt();
//
//			System.out.println("Veuillez saisir un second entier, svp ?");
//			int n2 = scanner.nextInt();
//
//			int res = n1 + n2;
//			System.out.printf("la somme de %d et de %d vaut %d\n", n1, n2, res);
//
//			scanner.close();
//
//		} catch (Exception e) {
//			System.out.println("Veuillez rentrer un nombre, svp !");
//		}

		// scaner avec une boucle while

		try (Scanner scanMe = new Scanner(System.in)) { // avec scanner, l'instance doit etre insérée avec le try( ) !!!
			while (true) {
				System.out.println("Please enter your name : ");
				String name = scanMe.next(); // name

				System.out.println("Please enter your password : ");
				String pswd = scanMe.next(); // number

//				if (name == "John" && pswd == "6321") {    doesn't work with ==  but works w/ .equals
				if (name.equals("John") && pswd.equals("6321")) { // equals ne prend que les String
					System.out.println("Welcome John");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Wrong name or/and password");
			// e.printStackTrace(); indique de manière un peu plus précise ou est l'erreur
		}

		System.out.println("----------------Boucle et comparateur  = >  < -------------------");
		// comparateur
		int n4 = 3;

		if (n4 > 0) {
			System.out.println(n4 + "est strictement positif");
		} else if (n4 < 0) {
			System.out.println(n4 + "est strictement negatif");
		} else {
			System.out.println(n4 + "est strictement null");
		}

		// switch
		String str6 = "two";

		switch (str6) {
		case "one":
			System.out.println("un");
			break;
		case "two":
			System.out.println("deux");
			break;
		case "three":
			System.out.println("trois");
			break;
		default:
			System.out.println("autre");
		}

		int u = 0;

		// Boucle while : a chaque iteration on teste si la condition est
		// vraie avant d’acceder aux traitements
		while (u < 5) {
			System.out.println(u);
			u++;
		}

		int q = 0;

		// La Boucle do ... while execute le bloc au moins une fois ensuite
		// elle verifie la condition
		do {
			System.out.println(q);
			q++;
		} while (q < 5);

		for (int index = 0; index < 5; index++) {
			System.out.println(index);
		}

		System.out.println("-------------------Array -  boucle for--------------------------");

//		String[] sports = new String[3];
		
//		sports[0] = "Judo";
//		sports[1] = "Tennis";
//		sports[2] = "Foot";
		
//		String[] sports = new String[] { "Judo", "Tennis", "Foot" }; // Taille 3 Fixe
		
		// tableau statique
		String[] sports = { "Judo", "Tennis", "Foot" }; // Taille 3 Fixe
		
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		System.out.println(sports[1]);
		
		// Collection dynamique    - import de la List et Arrays
		List<String> names = Arrays.asList("Tom", "Jerry", "Donald");
		
		
		for(int l = 0; l < names.size(); l++ ) {
			System.out.println(names.get(l));
		}
		
		for (String name : names) {
			System.out.println(name);
		}
		
		names.forEach((name) -> System.out.println(name));
		
	
		
	}

}
