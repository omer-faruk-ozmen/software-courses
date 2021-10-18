package fifthDayApp.core.adapters;

import fifthDayApp.core.abstracts.LoginWithGoogleService;
import fifthDayApp.loginWithGoogle.LoginWithGoogleManager;

public class LoginWithGoogleManagerAdapter implements LoginWithGoogleService {

	@Override
	public void logWithGoogle() {
		LoginWithGoogleManager loginWithGoogleManager = new LoginWithGoogleManager();
		loginWithGoogleManager.loginWithGoogle();

	}

}
