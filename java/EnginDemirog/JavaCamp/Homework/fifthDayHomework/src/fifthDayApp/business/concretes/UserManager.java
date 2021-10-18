package fifthDayApp.business.concretes;


import fifthDayApp.business.abstracts.UserService;
import fifthDayApp.core.abstracts.LoginWithGoogleService;
import fifthDayApp.dataAccess.abstracts.UserDao;
import fifthDayApp.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private LoginWithGoogleService loginWithGoogleService;

	public UserManager(UserDao userDao, LoginWithGoogleService loginWithGoogleService) {
		super();
		this.userDao = userDao;
		this.loginWithGoogleService = loginWithGoogleService;
	}

	private boolean mailControl(User user) {
		for (var mail : userDao.getAll()) {
			if (mail.getEmail() == user.getEmail()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void register(User user) {

		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Lütfen geçerli ad ve soyad giriniz.");
		} else if (user.getPassword().length() <= 7) {
			System.out.println("Lütfen geçerli şifre giriniz.");
		} else if (mailControl(user) == false) {

			System.out.println("Sisteme kayıtlı email adresi.");
		} else if (user.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$") == false) {
			System.out.println("Lütfen geçerli email adresi giriniz.");
		} else {

			userDao.register(user);

		}

	}

	@Override
	public void login(String email, String password) {

		for (var user : userDao.getAll()) {
			if (email == user.getEmail() && password == user.getPassword()) {
				userDao.login(user);
				return;
			}
		}

		System.out.println("Email veya Parola hatalı.");

	}

	@Override
	public void loginGoogle() {
		loginWithGoogleService.logWithGoogle();

	}

	@Override
	public void emailConfirm() {
		System.out.println("Email Doğrulandı.");

	}

}
