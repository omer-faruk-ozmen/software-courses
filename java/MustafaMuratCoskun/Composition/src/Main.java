
public class Main {

	public static void main(String[] args) {
		Resolution resolution = new Resolution(1920, 1080);
		Monitor monitor = new Monitor("VS197", "ASUS", "18.5", resolution);
		Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Tamperli Cam");
		Anakart anakart = new Anakart("B250-Pro", "Asus", 10, "Windows 10");
		Bilgisayar bilgisayar = new Bilgisayar(monitor, kasa, anakart);

		bilgisayar.getKasa().bilgisayariAc();
		bilgisayar.getMonitor().monitoruKapat();
		bilgisayar.getAnakart().isletimSistemiYukle("Windows 8");

	}

}
