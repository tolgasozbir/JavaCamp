package InterfaceAbstractDemo.Entities;

import InterfaceAbstractDemo.Abstract.Entity;

public class Customer implements Entity {

    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String nationalityId;

    public Customer(int id, String firstName, String lastName, String dateOfBirth, String nationalityId) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDateOfBirth(dateOfBirth);
        this.setNationalityId(nationalityId);
    }

    public Customer(){

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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
