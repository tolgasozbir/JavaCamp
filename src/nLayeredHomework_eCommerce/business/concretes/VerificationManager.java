package nLayeredHomework_eCommerce.business.concretes;

import nLayeredHomework_eCommerce.business.abstracts.VerificationService;
import nLayeredHomework_eCommerce.entities.concretes.User;

public class VerificationManager implements VerificationService {
    @Override
    public void sendMail(User user) {
        System.out.println(user.getMail() + " Adresine Onay Maili Gönderildi.");
    }

    @Override
    public void verifyMail(User user) {
        user.setVerify(true);
        System.out.println(user.getMail() + " Mail Adresi Onaylandı.");
    }
}
