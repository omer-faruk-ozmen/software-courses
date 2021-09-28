import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int girisHakki = 3;
		String kullaniciAdi = "OFO";
		String parola = "1234";

		System.out.println("Kullan�c� Giri�i");

		while (true) {
			System.out.print("Kullan�c� Ad�: ");
			String kullanici = scanner.nextLine();
			System.out.print("Parola: ");
			String inParola = scanner.nextLine();

			if (kullanici.equals(kullaniciAdi) && parola.equals(inParola)) {
				System.out.println("Ho�geldiniz. " + kullanici);
				break;
			} else if (kullanici.equals(kullaniciAdi) && !parola.equals(inParola)) {
				System.out.println("Parola Yanl��.");
				girisHakki -= 1;
			} else if (!kullanici.equals(kullaniciAdi) && parola.equals(inParola)) {
				System.out.println("Kullan�c� Ad� Yanl��.");
				girisHakki -= 1;
			} else {
				System.out.println("Kullan�c� Ad�n�z ve Parolan�z Yanl��");
				girisHakki -= 1;
			}
			if (girisHakki == 0) {
				System.out.println("Giri� hakk�n�z bitti l�tfen tekrar deneyiniz.");
			}
		}

	}

}
