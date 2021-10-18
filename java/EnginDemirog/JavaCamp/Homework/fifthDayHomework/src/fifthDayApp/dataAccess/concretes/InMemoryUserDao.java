package fifthDayApp.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import fifthDayApp.dataAccess.abstracts.UserDao;
import fifthDayApp.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	List<User> users = new ArrayList<User>();

	@Override
	public void register(User user) {
		users.add(user);
		System.out.println("Merhaba " + user.getFirstName() + " Kayıt başarılı lütfen emaili onaylayınız");

	}

	@Override
	public void login(User user) {
		System.out.println("Merhaba " + user.getFirstName() + " Giriş yaptın.");

	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
