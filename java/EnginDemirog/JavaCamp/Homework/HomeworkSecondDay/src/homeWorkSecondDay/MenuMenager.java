package homeWorkSecondDay;

public class MenuMenager {

	public void goToSite(Menu menu) {
		System.out.println("\n|");
		System.out.println("|");
		System.out.println("Siteye git'e tıklandı" + menu.siteUrl);
		
	}
	public void signOut(Menu menu) {
		System.out.println("|");
		System.out.println("|");
		System.out.println("Hesaptan çıkış yap'a tıklandı. Button id = " +menu.id);
	}

}
