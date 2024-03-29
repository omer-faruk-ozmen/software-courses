
public class Hayvan {
	
	private String isim;
	private int kg;
	private int boy;
	private int bacakSayisi;
	
	public Hayvan(String isim, int kg, int boy, int bacakSayisi) {
		super();
		this.isim = isim;
		this.kg = kg;
		this.boy = boy;
		this.bacakSayisi = bacakSayisi;
	}
	
	public void yemekYe() {
		System.out.println("Hayvan şu anda yemek yiyor");
	}

	
	public void hareketeGec(int hiz) {
		System.out.println("Hayvan "+hiz+" ile hareket ediyor");
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	public int getBoy() {
		return boy;
	}

	public void setBoy(int boy) {
		this.boy = boy;
	}

	public int getBacakSayisi() {
		return bacakSayisi;
	}

	public void setBacakSayisi(int bacakSayisi) {
		this.bacakSayisi = bacakSayisi;
	}
}
