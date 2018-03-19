import java.util.*;

public class pendu {
	static Scanner scan = new Scanner (System.in);
	static String a;
	static int coup = 10;
	
	public static String quellemot() {
		System.out.println("Quel mot veux-tu cacher?");
		a = scan.nextLine();

		for (int i = 0; i < 40; i++) {
			System.out.println(" ");
		}
		System.out.println("La partie va commencer");
		return a;
	}
	
	public static char[] creermot (String s) {
		int longueur = s.length();
		char tab [] = new char [longueur];

		for (int i = 0; i < longueur; i++) {
			tab[i] = s.charAt(i);
		}
		System.out.println("\nTu vas devoir trouver " + tab.length + " lettre(s)");
		return tab;
	}
	
	public static boolean[] creervu (char []mot) {
		int longueur = mot.length;
		boolean tab [] = new boolean [longueur];

		for (int i = 0; i < longueur; i++) {
			tab[i] = false;
		}
		return tab;
	}
	
	public static void affiche(char []mot, boolean []vu) {
		for (int i = 0; i < mot.length; i++) {
			if (!vu[i]) {
				System.out.print('-');
			} else {
				System.out.print(mot[i]);
			}
		}
	}
	
	public static char quellelettre() {
		System.out.println("\nQuelle lettre choisis-tu ??");
		char c = scan.nextLine().charAt(0);
		return c;
	}
	
	public static boolean [] verif(char []mot, boolean []vu, char c) {
		int b = 0;
		int i = 0;
		
		for (i = 0; i < mot.length; i++) {
			if (mot[i] == c) {
				vu[i] = true;
				b++;
			}
		} if (b >= 1) {
			System.out.println("Il y a " + b + " fois la lettre(s) " + c);
			System.out.println("Il vous reste "+ coup+" coup"+((coup < 2)?"":"s"));
		}else {
			System.out.println("Tu n'as pas trouvé de lettre");
			coup--;
			System.out.println("Il vous reste "+ coup+" coup"+((coup < 2)?"":"s"));
		}
		return vu;
	}
	
	public static boolean fin (boolean vu[],int pcoup) {
		int i = 0;
		if(pcoup<=0) {
			System.out.println("gameover");
			return true;
		}
		while (i < vu.length) {
			if (vu[i] != true)
				return false;
			i++;
		}
		System.out.println("Tu as trouvé le mot, bien joué : " + a);
		return true;
	}
	
	public static void main (String[]args) {
		String a = quellemot();
		char tabmot [] = creermot(a);
		boolean tabvu [] = creervu(tabmot);
		affiche(tabmot, tabvu);
		char b = quellelettre();
		boolean tabverif[] = verif(tabmot, tabvu, b);
		boolean z = fin(tabverif,coup);
		
		while (!z) {
			affiche(tabmot, tabvu);
			b = quellelettre();
			tabverif = verif(tabmot, tabvu, b);
			z = fin(tabverif,coup);
		}
	}
}