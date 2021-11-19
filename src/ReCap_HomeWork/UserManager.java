package ReCap_HomeWork;

public class UserManager {
    public void add(User user){
        System.out.println("Sisteme Eklendi : " + user.getFirstName());
    }

    public void remove(User user){
        System.out.println("Sistemden Silindi : " + user.getFirstName());
    }

    public void Update(User user){
        System.out.println(user.getId() + " Id'li Kullanıcı Bilgileri Güncellendi.");
    }

}
