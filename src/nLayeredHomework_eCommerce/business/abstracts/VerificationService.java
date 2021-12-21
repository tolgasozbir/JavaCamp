package nLayeredHomework_eCommerce.business.abstracts;

import nLayeredHomework_eCommerce.entities.concretes.User;

public interface VerificationService {
    void sendMail(User user);
    void verifyMail(User user);
}
