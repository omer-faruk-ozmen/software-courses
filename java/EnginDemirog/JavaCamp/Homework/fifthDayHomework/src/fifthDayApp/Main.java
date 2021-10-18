package fifthDayApp;

import fifthDayApp.business.abstracts.UserService;
import fifthDayApp.business.concretes.UserManager;
import fifthDayApp.core.adapters.LoginWithGoogleManagerAdapter;

import fifthDayApp.dataAccess.concretes.InMemoryUserDao;
import fifthDayApp.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new InMemoryUserDao(), new LoginWithGoogleManagerAdapter());

		User one = new User("Ömer Faruk", "Özmen", "omerfarukozmen0@gmail.com", "1234567");
		User two = new User("Yanlış", "Kullanıcı", "yanlisemail@em@ail", "12345");

		userService.register(one);
		userService.emailConfirm();
		userService.register(two);
		userService.emailConfirm();

		System.out.println("------------------------------------------------------");

		userService.loginGoogle();
		userService.login("omerfarukozmen0@gmail.com", "1234567");
		userService.login("yanlisemail@ema@il", "1234");
		userService.emailConfirm();

	}

}
