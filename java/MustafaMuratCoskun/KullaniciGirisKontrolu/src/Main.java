import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int girisHakki = 3;
		String kullaniciAdi = "OFO";
		String parola = "1234";

		System.out.println("Kullanýcý Giriþi");

		while (true) {
			System.out.print("Kullanýcý Adý: ");
			String kullanici = scanner.nextLine();
			System.out.print("Parola: ");
			String inParola = scanner.nextLine();

			if (kullanici.equals(kullaniciAdi) && parola.equals(inParola)) {
				System.out.println("Hoþgeldiniz. " + kullanici);
				break;
			} else if (kullanici.equals(kullaniciAdi) && !parola.equals(inParola)) {
				System.out.println("Parola Yanlýþ.");
				girisHakki -= 1;
			} else if (!kullanici.equals(kullaniciAdi) && parola.equals(inParola)) {
				System.out.println("Kullanýcý Adý Yanlýþ.");
				girisHakki -= 1;
			} else {
				System.out.println("Kullanýcý Adýnýz ve Parolanýz Yanlýþ");
				girisHakki -= 1;
			}
			if (girisHakki == 0) {
				System.out.println("Giriþ hakkýnýz bitti lütfen tekrar deneyiniz.");
			}
		}

	}

}
