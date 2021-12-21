package nLayeredHomework_eCommerce.business.concretes;

import nLayeredHomework_eCommerce.business.abstracts.UserCheckService;
import nLayeredHomework_eCommerce.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCheckManager implements UserCheckService {

    List<String> mailList = new ArrayList<String>();

    @Override
    public boolean checkFirstName(User user) {
        if(user.getFirstName().length() < 2){
            System.out.println("Ad en az 2 karakter olmalıdır! ");
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean checkLastName(User user) {
        if(user.getLastName().length() < 2){
            System.out.println("Soyad en az 2 karakter olmalıdır! ");
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean checkPassword(User user) {
        if(user.getPassword().length() < 6){
            System.out.println("Parola en az 6 haneli olmalı!");
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean checkEMail(User user) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher= pattern.matcher(user.getMail());
        if(matcher.matches() == false){
            System.out.println("Geçersiz mail adresi!");
            return false;
        }else{
            if(mailList.contains(user.getMail())){
                System.out.println("Bu mail ile zaten kayıt olunmuş");
                return false;
            }else{
                mailList.add(user.getMail());
                return true;
            }
        }
    }

    @Override
    public boolean isUserApproved(User user) {
        if(checkFirstName(user) && checkLastName(user) && checkPassword(user) && checkEMail(user)){
            return true;
        }else{
            return false;
        }
    }
}
