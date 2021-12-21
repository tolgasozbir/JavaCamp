package nLayeredHomework_eCommerce.entities.concretes;

import nLayeredHomework_eCommerce.entities.abstracts.Entity;

public class User implements Entity {
    int id;
    String firstName;
    String lastName;
    String password;
    String mail;
    boolean isVerify=false;

    public User() {
    }

    public User(int id, String firstName, String lastName, String password, String mail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.mail = mail;
        this.isVerify = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean getIsVerify() {
        return isVerify;
    }

    public void setVerify(boolean verify) {
        isVerify = verify;
    }
}
