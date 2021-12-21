package nLayeredHomework_eCommerce.dataAccess.abstracts;

import nLayeredHomework_eCommerce.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void update(User user);
    void delete(User user);
    User getUser(int id);
    List<User> getAllUsers();
}
