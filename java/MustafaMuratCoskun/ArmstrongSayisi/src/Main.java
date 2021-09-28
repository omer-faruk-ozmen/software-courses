import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Sayıyı Giriniz: ");
		int sayi = scanner.nextInt();
		int basamakSayisi = 0;

		while (sayi > 0) {
			sayi /= 10;
			basamakSayisi++;
		}
		int geciciSayi = sayi;
		int toplam = 0;

		do {
			int basamakDegeri = geciciSayi % 10;
			geciciSayi /= 10;
			toplam += Math.pow(basamakDegeri, basamakSayisi);
		} while (geciciSayi > 0);
		if (sayi == toplam) {
			System.out.println(geciciSayi + " Sayısı bir armstrong sayısıdır.");
		} else {
			System.out.println(geciciSayi + " Sayısı bir armstrong sayısı değildir.");
		}
	}

}
