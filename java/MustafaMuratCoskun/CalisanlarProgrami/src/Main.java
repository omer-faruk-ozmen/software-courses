import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Çalışanlar Programına Hoşgeldiniz.");

		String islemler = "İşlemler... \n" + "1) Yazılımcı İşlemleri\n" + "2) Yönetici İşlemleri\n"
				+ "3) Çıkış için q'ya basın";
		System.out.println("*******************");
		System.out.println(islemler);
		System.out.println("*******************");

		while (true) {
			System.out.print("İşlemi Seçiniz. ");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("Programdan Çıkılıyor...");
				break;
			} else if (islem.equals("1")) {
				Yazilimci yazilimci = new Yazilimci("Ömer Faruk", "Özmen", 567, "Python,Java,C");
				String yazilimciIslem = "1)Format At\n" + "2)Bilgiler Göster\n" + "Çıkış İçin q'ya basın";
				System.out.println("************************");
				System.out.println(yazilimciIslem);
				while (true) {
					System.out.print("İşlemi Seçiniz : ");
					String yIslem = scanner.nextLine();

					if (yIslem.equals("q")) {
						System.out.println("Yazılımcı İşlemlerinden Çıkılıyor");
						break;
					} else if (yIslem.equals("1")) {
						System.out.print("İşletim Sistemi : ");
						String isletimSistemi = scanner.nextLine();
						yazilimci.formatAt(isletimSistemi);
					} else if (yIslem.equals("2")) {
						yazilimci.bilgileriGoster();
					} else {
						System.out.println("Geçersiz Yazılımcı İşlemi");
					}

				}

			} else if (islem.equals("2")) {
				Yonetici yonetici = new Yonetici("Serhat", "Say", 123, 10);

				String yoneticiIslem = "Yönetici İşlemleri \n" + "1) Zam Yap\n" + "2) Bilgiler Göster\n"
						+ "Çıkış için q'ya basınız.";
				System.out.println("**********************");
				System.out.println(yoneticiIslem);

				while (true) {
					System.out.print("İşlem Seçiniz : ");
					String yIslem = scanner.nextLine();

					if (yIslem.equals("q")) {
						System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
						break;
					} else if (yIslem.equals("1")) {
						System.out.print("Zam Miktarı Ne Kadar : ");
						int zamMiktari = scanner.nextInt();
						scanner.nextLine();
						yonetici.zamYap(zamMiktari);
					} else if (yIslem.equals("2")) {
						yonetici.bilgileriGoster();
					} else {
						System.out.println("Geçersiz İşlem");
					}
				}

			} else {
				System.out.println("Geçersiz İşlem");
			}
		}

	}

}
