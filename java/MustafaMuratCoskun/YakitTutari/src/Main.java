import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ara� km de ka� kuru� yak�yor? (�rnek: 0,55): ");
		double yakit = scanner.nextDouble();

		System.out.print("Mesafe Ka� km? ");
		int mesafe = scanner.nextInt();

		double tutar = yakit * mesafe;

		tutar = (int) tutar;

		System.out.print(mesafe + " km i�in toplam yak�t tutar�: " + tutar + " tl");
	}

}
