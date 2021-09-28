import java.util.Scanner;

public class ATM {
	public void calis(Hesap hesap) {
		Login login = new Login();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bankamıza Hoşgeldiniz...");
		System.out.println("Kullanıcı Girişi");

		int girisHakki = 3;

		while (true) {
			if (login.login(hesap)) {
				System.out.println("Giriş Başarılı...");
				break;
			} else {
				System.out.println("Giriş Başarısız.");
				girisHakki -= 1;
				System.out.println("Kalan giriş hakkı " + girisHakki);
			}
			if (girisHakki == 0) {
				System.out.println("Giriş Hakkınız Bitti");
				return;
			}
		}
		String islemler = "1) Bakiye Görüntüle\n" + "2) Para Yatırma\n" + "3) Para Çekme\n" + "Çıkış için q";
		System.out.println(islemler);

		while (true) {
			System.out.print("İşlemi Seçiniz");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("Çıkış Yapılıyor...");
				break;
			} else if (islem.equals("1")) {
				System.out.println("Merhaba " + hesap.getKullaniciAdi() + " Bakiyeniz " + hesap.getBakiye());
			} else if (islem.equals("2")) {
				System.out.print("Yatırmak İstediğiniz Tutar");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraYatir(tutar);
			} else if (islem.equals("3")) {
				System.out.print("Çekmek istediğiniz Tutar");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraCek(tutar);
			} else {
				System.out.println("Geçersiz İşlem Lütfen Doğru Bir Tuşlama Yapınız.");
			}
		}
	}

}
