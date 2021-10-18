
public class UserMenager {

	public void Signin(User user) {
		System.out.println("Hoşgeldiniz " + user.firstName + " " + user.lastName + "\n" + user.email
				+ " adresine onay mesajı gönderilmiştir.");
		Brace brace = new Brace();
		brace.sBrace();
	}

	public void Login(User user) {
		System.out.println("Hoşgeldiniz " + user.firstName + " " + user.lastName);
		Brace brace = new Brace();
		brace.sBrace();
	}

	public void Logout() {
		System.out.println("Çıkış yapılıyor...");
		Brace brace = new Brace();
		brace.lBrace();
	}

}
