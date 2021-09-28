
public class GelismisAbone {
	private String isim;
	private int bakiye = 120;
	private String sehir;

	public GelismisAbone(String isim, int bakiye, String sehir) {
		this.isim = isim;
		if (bakiye >= 0 && bakiye <= 120) {
			this.bakiye = bakiye;
		}
		this.sehir = sehir;
	}

	public void dogalgazKullan(int miktar) {
		if (this.bakiye - miktar < 0) {
			System.out.println("Yeterli Bakiye Yok");
		} else {
			this.bakiye -= miktar;
			if (this.bakiye <= 0) {
				System.out.println("Bakiyeniz Bitmiştir Lütfen Yükleme Yapınız.");
			} else {
				System.out.println("Yeni Bakiye : " + bakiye);
			}
		}
	}

	public void bakiyeOgren() {
		System.out.println("Bakiyeniz : " + bakiye);
	}

}
