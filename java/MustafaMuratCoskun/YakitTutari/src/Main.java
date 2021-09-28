import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Araç km de kaç kuruþ yakýyor? (Örnek: 0,55): ");
		double yakit = scanner.nextDouble();

		System.out.print("Mesafe Kaç km? ");
		int mesafe = scanner.nextInt();

		double tutar = yakit * mesafe;

		tutar = (int) tutar;

		System.out.print(mesafe + " km için toplam yakýt tutarý: " + tutar + " tl");
	}

}
