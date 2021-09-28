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

		String islemler = "1) Toplama" + "2) ��karma" + "3) �arpma" + "4) B�lme" + "��k�� i�in q tu�una bas�n�z.";
		System.out.println("*************************");
		System.out.println(islemler);
		System.out.println("*************************");

		while (true) {
			System.out.println("��lemi Se�iniz");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor");
				break;
			} else if (islem.equals("1")) {
				System.out.print("Ka� de�er toplanacak? 2 veya 3");
				int kacSayi = scanner.nextInt();

				if (kacSayi == 2) {
					System.out.print("1.Say�: ");
					int sayi1 = scanner.nextInt();
					System.out.print("2.Say�: ");
					int sayi2 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Say�lar�n Toplam�: " + toplama(sayi1, sayi2));

				} else if (kacSayi == 3) {
					System.out.print("1.Say�: ");
					int sayi1 = scanner.nextInt();
					System.out.print("2.Say�: ");
					int sayi2 = scanner.nextInt();
					System.out.print("3.Say�: ");
					int sayi3 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Say�lar�n Toplam�: " + toplama(sayi1, sayi2, sayi3));

				} else {
					System.out.println("L�tfen ge�erli say� giriniz.");
				}
			}
		}
	}

}
