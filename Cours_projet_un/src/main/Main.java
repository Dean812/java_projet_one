package main;

public class Main {

	public static void main(String[] args) {

		// cmd eclipse
		// commenter/decommenter : CTRL + shilt + C
		// indenter : CTRL + shilt + F

		// Represente la methode principale, d'entree / sortie de notre programme
		// Il ne peut y avoir qu'une methode [...] main(String[] args) dans une
		// application

		System.out.print("Hello print() !");   // <-- ce n'est pas un println 
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

		Integer z = 22;
		String str3 = z.toString();
		System.out.println(str3); // Affiche "22", si on vérifie le type, ce sera un String

		int v = 2; // casting - int est primitif et pas un objet
		String str4 = ((Integer) v).toString();
		System.out.println(str4); // Affiche "2"

		int w = 4; // autre manière de gérer le int en string
		String str5 = Integer.toString(w);
		System.out.println(str5);

		System.out.println("------------conversion entre type +/- proche ----------------------");

		// Pas besoin de convertir un type primitif vers son type Objet / Wrapper
		Integer n = 2;
		int m = n;
		System.out.println(m);

		int k = 3;
		Integer j = k;
		System.out.println(j);

		System.out.println("---------------pre/post incrémentation-------------------");

		//  +=    >>  f = i  = i + 2
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
		int c = 2;  // rappel i = 7
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
		//lequel on insert le calcule, on insert dans inti mais init reste a 10. 
		
//		très bonne exemple dans mon evernote - Orsys > java8 cours vocabulaire ▼ 
		System.out.println("Exemple clair de post incrémentation : ");
		int intJ = 10;
		int intK = 11;
		int intZ = (intJ++)+(++intK);
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

		System.out.println("------------------------------------------------------------------");

	}

}
