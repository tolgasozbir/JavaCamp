package nLayeredHomework_eCommerce.business.abstracts;

import nLayeredHomework_eCommerce.entities.concretes.User;

public interface UserCheckService {
    boolean checkFirstName(User user);
    boolean checkLastName(User user);
    boolean checkPassword(User user);
    boolean checkEMail(User user);
    boolean isUserApproved(User user);
}
