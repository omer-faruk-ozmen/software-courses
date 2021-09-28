import java.util.Scanner;

public class Main {

	public static int cikarma(int a, int b) {
		return (a - b);
	}

	public static int bolme(int a, int b) {
		return (a / b);
	}

	public static int toplama(int a, int b) {
		return (a + b);
	}

	public static int toplama(int a, int b, int c) {
		return (a + b + c);
	}

	public static int cikarma(int a, int b, int c) {
		return (a + b + c);
	}

	public static int carpma(int a, int b) {
		return (a * b);
	}

	public static int carpma(int a, int b, int c) {
		return (a * b * c);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String islemler = "1) Toplama" + "2) Çýkarma" + "3) Çarpma" + "4) Bölme" + "Çýkýþ için q tuþuna basýnýz.";
		System.out.println("*************************");
		System.out.println(islemler);
		System.out.println("*************************");

		while (true) {
			System.out.println("Ýþlemi Seçiniz");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("Programdan Çýkýlýyor");
				break;
			} else if (islem.equals("1")) {
				System.out.print("Kaç deðer toplanacak? 2 veya 3");
				int kacSayi = scanner.nextInt();

				if (kacSayi == 2) {
					System.out.print("1.Sayý: ");
					int sayi1 = scanner.nextInt();
					System.out.print("2.Sayý: ");
					int sayi2 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Sayýlarýn Toplamý: " + toplama(sayi1, sayi2));

				} else if (kacSayi == 3) {
					System.out.print("1.Sayý: ");
					int sayi1 = scanner.nextInt();
					System.out.print("2.Sayý: ");
					int sayi2 = scanner.nextInt();
					System.out.print("3.Sayý: ");
					int sayi3 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Sayýlarýn Toplamý: " + toplama(sayi1, sayi2, sayi3));

				} else {
					System.out.println("Lütfen geçerli sayý giriniz.");
				}
			}
		}
	}

}
