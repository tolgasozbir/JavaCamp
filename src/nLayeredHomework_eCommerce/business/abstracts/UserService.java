package nLayeredHomework_eCommerce.business.abstracts;

import nLayeredHomework_eCommerce.entities.concretes.User;

public interface UserService {
    void signIn(User user);
    void signInWithGoogle(User user);
    void login(String eMail,String password);
}
