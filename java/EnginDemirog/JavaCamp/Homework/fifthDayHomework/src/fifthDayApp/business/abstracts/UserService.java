package fifthDayApp.business.abstracts;

import fifthDayApp.entities.concretes.User;

public interface UserService {

	void register(User user);
	void login(String email, String password);
	void loginGoogle();
	void emailConfirm();
}
