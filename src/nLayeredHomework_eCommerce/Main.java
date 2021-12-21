package nLayeredHomework_eCommerce;

import nLayeredHomework_eCommerce.business.abstracts.VerificationService;
import nLayeredHomework_eCommerce.business.concretes.UserCheckManager;
import nLayeredHomework_eCommerce.business.concretes.UserManager;
import nLayeredHomework_eCommerce.business.concretes.VerificationManager;
import nLayeredHomework_eCommerce.core.concretes.GoogleAuthManagerAdapter;
import nLayeredHomework_eCommerce.dataAccess.concretes.HibernateUserDao;
import nLayeredHomework_eCommerce.entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        VerificationService verificationService = new VerificationManager();
        UserManager userManager = new UserManager(new HibernateUserDao(),new UserCheckManager(),verificationService,new GoogleAuthManagerAdapter());

        User user1 = new User(1,"tolga","sözbir","123456","tolgasoz1@gmail.com");
        User user2 = new User(2,"Levent","Sözbir","abc1230","levo@hotmail.com");

        userManager.signIn(user2);
        verificationService.verifyMail(user2);
        userManager.signInWithGoogle(user1);

        userManager.login("tolgasoz1@gmail.com","123456");
    }
}
