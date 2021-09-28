
public class Yonetici extends Calisan {
	private int sorumluKisiSayisi;

	public Yonetici(String ad, String soyad, int id, int sorumluKisiSayisi) {
		super(ad, soyad, id);
		this.sorumluKisiSayisi = sorumluKisiSayisi;

	}

	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayısı : "+sorumluKisiSayisi);
	}
	public void zamYap(int zamMiktari) {
		System.out.println(getAd()+" Çalışanlara "+zamMiktari +" tl zam yaptı");
	}

}
