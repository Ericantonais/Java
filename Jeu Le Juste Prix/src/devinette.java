import java.util.Scanner;

public class devinette {
	static int NumeroSecret = (int) (Math.random() * 1000 + 1);
	static Scanner sc = new Scanner(System.in);
	static int nombre;

	public static int devine() {
		for (int i=9; i>=0; i--) {
		System.out.println("Devine le nombre que j'ai choisi (entre 1 et 1000)");
		nombre = sc.nextInt();
		
			if (nombre < 1 || nombre > 1000) {
				System.out.println("Entre 1 et 1000 on t'a dit ! Tu sais pas lire ?");
				System.out.println("Il te reste " + i + " tour" + ((i < 2)?"":"s"));
			} else if (nombre > NumeroSecret) {
				System.out.println("TOO BIIIIIIGGGG");
				System.out.println("Il te reste " + i + " tour"+ ((i < 2)?"":"s"));
			} else if (nombre < NumeroSecret) {
				System.out.println("Trop riquiqui");
				System.out.println("Il te reste " + i + " tour"+ ((i < 2)?"":"s"));
			} else {
				System.out.println("You did it !! You're extraordinary !!");
				return nombre;
			}
		}
		System.out.println("Perdu ! T'es nul !");
		System.out.println("La réponse était: " + NumeroSecret);
		return nombre;
	}
	
	public static void main(String[] args) {
		devine();
	}
}