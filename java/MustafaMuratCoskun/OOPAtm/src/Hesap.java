
public class Hesap {
	private String kullaniciAdi;
	private String parola;
	private double bakiye;

	public Hesap(String kullaniciAdi, String parola, double bakiye) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.parola = parola;
		this.bakiye = bakiye;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	public void paraYatir(int tutar) {
		bakiye += tutar;
		System.out.println("Başarılı yeni bakiye : " + bakiye);
	}

	public void paraCek(int tutar) {
		if ((bakiye - tutar) < 0) {
			System.out.println("Yeterli Bakiye Yok");
		} else {
			bakiye -= tutar;
			System.out.println("Başarılı yeni bakiye : " + bakiye);
		}
	}

}
