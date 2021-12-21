package nLayeredHomework_eCommerce.dataAccess.concretes;

import nLayeredHomework_eCommerce.dataAccess.abstracts.UserDao;
import nLayeredHomework_eCommerce.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

    List<User> users = new ArrayList<User>();

    @Override
    public void add(User user) {
        this.users.add(user);
        System.out.println("Kayıt Başarılı : "+user.getFirstName() + " " + user.getLastName());
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return this.users;
    }
}
