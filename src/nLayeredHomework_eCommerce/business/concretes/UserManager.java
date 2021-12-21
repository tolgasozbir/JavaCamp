package nLayeredHomework_eCommerce.business.concretes;

import nLayeredHomework_eCommerce.business.abstracts.UserCheckService;
import nLayeredHomework_eCommerce.business.abstracts.UserService;
import nLayeredHomework_eCommerce.business.abstracts.VerificationService;
import nLayeredHomework_eCommerce.core.abstracts.GoogleAuthService;
import nLayeredHomework_eCommerce.dataAccess.abstracts.UserDao;
import nLayeredHomework_eCommerce.entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {

    private List<User> userList;
    private UserDao userDao;
    private UserCheckService userCheckService;
    private VerificationService verificationService;
    private GoogleAuthService googleAuthService;
    public UserManager(UserDao userDao,UserCheckService userCheckService,
                       VerificationService verificationService, GoogleAuthService googleAuthService)
    {
        this.userDao = userDao;
        this.userCheckService = userCheckService;
        this.verificationService = verificationService;
        this.userList=userDao.getAllUsers();
        this.googleAuthService = googleAuthService;
    }

    @Override
    public void signIn(User user) {
        if(this.userCheckService.isUserApproved(user)){
            userDao.add(user);
            verificationService.sendMail(user);
            //verificationService.verifyMail(user);
        }
    }

    @Override
    public void signInWithGoogle(User user) {
        if (this.userCheckService.isUserApproved(user)){
            user.setVerify(true);
            this.googleAuthService.signInWGoogle(user);
            userDao.add(user);
        }
    }

    @Override
    public void login(String eMail,String password) {
        for (User usr:userList) {
            if (usr.getMail() == eMail && usr.getPassword() == password){
                if(usr.getIsVerify()){
                    System.out.println("Giriş Başarılı\nHoş geldin "+usr.getFirstName());
                }else{
                    System.out.println("lütfen hesabınızı onaylayın");
                }
                return;
            }
        }
        System.out.println("Giriş Bilgilerini Kontrol Edin!");
    }
}
