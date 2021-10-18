package fifthDayApp.dataAccess.abstracts;

import java.util.List;

import fifthDayApp.entities.concretes.User;

public interface UserDao {

	void register(User user);

	void login(User user);

	List<User> getAll();

}
