import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int bakiye = 0;
		String islemler = "1) Bakiye ��renme\n2) Para �ekme\n3) Para Yat�rma\n" + "��k�� i�in q harfine bas�n�z.";
		System.out.println("************************");
		System.out.println(islemler);
		System.out.println("************************");

		while (true) {
			String islem = scanner.nextLine();
			System.out.println("��lemi Se�iniz:");
			if (islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor...");
				break;
			} else if (islem.equals("1")) {
				System.out.println("Bakiyeniz: " + bakiye);

			} else if (islem.equals("2")) {
				System.out.print("�ekmek istedi�iniz tutar: ");
				int paraCekme = scanner.nextInt();
				scanner.nextLine();
				if (bakiye - paraCekme < 0) {
					System.out.println("Yetersiz bakiye l�tfen yeni tutar giriniz. Bakiyeniz " + bakiye);
				} else {
					bakiye -= paraCekme;
					System.out.println("Para �ekme i�lemi ba�ar�l�.");
				}
			} else if (islem.equals("3")) {
				System.out.print("Yat�rmak istedi�iniz tutar :");
				int paraYatirma = scanner.nextInt();
				scanner.nextLine();
				bakiye += paraYatirma;
				System.out.println("Para yat�rma i�lemi ba�ar�l�. Yeni Bakiye : " + bakiye);
			} else {
				System.out.println("Ge�ersiz ��lem");
			}
		}
	}

}
