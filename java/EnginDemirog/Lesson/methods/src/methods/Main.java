package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,3,4,5,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			mesajVer("Sayı Mevcuttur : "+aranacak);
		
		}else {
			mesajVer("Sayı Mevcut değildir : "+aranacak);
		}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
