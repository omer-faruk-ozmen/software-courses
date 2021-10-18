package homeWorkSecondDay;

public class Main {

	public static void main(String[] args) {
		
		Menu myCourses = new Menu(1,"Kurslarım","https://www.kodlama.io/courses/enrolled");
		Menu allCourses = new Menu(2,"Tüm Kurslar","https://www.kodlama.io/courses");
		Menu prepairing = new Menu(3,"Kampa Hazırlık","https://www.kodlama.io/p/kampa-hazirlik");
		Menu questions = new Menu(4,"Sık Sorulan Sorular","https://www.kodlama.io/p/sorular");
		Menu profile = new Menu(5,"Çıkış Yap","https://www.kodlama.io/sign_out");
		
		Menu[] menu = {myCourses,allCourses,prepairing,questions,profile};
		
		for(Menu menus : menu) {
			System.out.print(menus.name);
			System.out.print(" / ");
		}
		
		
		MenuMenager menuMenager = new MenuMenager();
		menuMenager.goToSite(profile);
		menuMenager.signOut(profile);
		
		
	}

}
