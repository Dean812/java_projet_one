package main;

public class Main {

	public static void main(String[] args) {

		// cmd eclipse
		// commenter/decommenter : CTRL + shilt + C
		// indenter : CTRL + shilt + F

		// Represente la methode principale, d'entree / sortie de notre programme
		// Il ne peut y avoir qu'une methode [...] main(String[] args) dans une
		// application

		System.out.print("Hello print() !");
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

		Integer z = 2;
		String str3 = z.toString();
		System.out.println(str3); // Affiche "2"

		int v = 2; // casting - int est primitif et pas un objet
		String str4 = ((Integer) v).toString();
		System.out.println(str4); // Affiche "2"

		int w = 4; // autre manière de gérer le int en string
		String str5 = Integer.toString(w);
		System.out.println(str5);

		System.out.println("------------------------------------------------------------------");

		// Pas besoin de convertir un type primitif vers son type Objet / Wrapper
		Integer n = 2;
		int m = n;
		System.out.println(m);

		int k = 3;
		Integer j = k;
		System.out.println(j);

		System.out.println("------------------------------------------------------------------");

	}

}
