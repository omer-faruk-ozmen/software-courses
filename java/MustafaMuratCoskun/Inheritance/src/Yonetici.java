
public class Yonetici extends Calisan {
	private int sorumluKisi;

	public Yonetici(String isim, int maas, String departman, int sorumluKisi) {
		super(isim, maas, departman);
		this.sorumluKisi = sorumluKisi;

	}

	public void zamYap(int zamMiktari) {
		System.out.println("Çalışanlara " + zamMiktari + " Tl zam yapıldı");
	}

	public void bilgileriGoster() {
		System.out.println("İsim : " + getIsim());
		System.out.println("Maaş : " + getMaas());
		System.out.println("Departman : " + getDepartman());

		super.bilgileriGoster();

		System.out.println("Sorumlu Kişi Sayısı : " + sorumluKisi);
	}

}
