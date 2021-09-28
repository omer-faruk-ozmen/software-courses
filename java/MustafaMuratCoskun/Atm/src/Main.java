import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int bakiye = 0;
		String islemler = "1) Bakiye Öðrenme\n2) Para Çekme\n3) Para Yatýrma\n" + "Çýkýþ için q harfine basýnýz.";
		System.out.println("************************");
		System.out.println(islemler);
		System.out.println("************************");

		while (true) {
			String islem = scanner.nextLine();
			System.out.println("Ýþlemi Seçiniz:");
			if (islem.equals("q")) {
				System.out.println("Programdan çýkýlýyor...");
				break;
			} else if (islem.equals("1")) {
				System.out.println("Bakiyeniz: " + bakiye);

			} else if (islem.equals("2")) {
				System.out.print("Çekmek istediðiniz tutar: ");
				int paraCekme = scanner.nextInt();
				scanner.nextLine();
				if (bakiye - paraCekme < 0) {
					System.out.println("Yetersiz bakiye lütfen yeni tutar giriniz. Bakiyeniz " + bakiye);
				} else {
					bakiye -= paraCekme;
					System.out.println("Para çekme iþlemi baþarýlý.");
				}
			} else if (islem.equals("3")) {
				System.out.print("Yatýrmak istediðiniz tutar :");
				int paraYatirma = scanner.nextInt();
				scanner.nextLine();
				bakiye += paraYatirma;
				System.out.println("Para yatýrma iþlemi baþarýlý. Yeni Bakiye : " + bakiye);
			} else {
				System.out.println("Geçersiz Ýþlem");
			}
		}
	}

}
