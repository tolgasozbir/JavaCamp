package nLayeredHomework_eCommerce.core.concretes;

import nLayeredHomework_eCommerce.core.abstracts.GoogleAuthService;
import nLayeredHomework_eCommerce.entities.concretes.User;
import nLayeredHomework_eCommerce.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements GoogleAuthService {
    @Override
    public void signInWGoogle(User user) {
        GoogleAuthManager auth = new GoogleAuthManager();
        auth.signInWithGoogle();
    }
}
