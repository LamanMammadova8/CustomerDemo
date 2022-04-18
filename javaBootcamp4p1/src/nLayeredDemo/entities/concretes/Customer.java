package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;

public class Customer implements Entity {
    private int id;
    private int nationalId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Customer(){

    }

    public Customer(int id, int nationalId, String firstName, String lastName, String dateOfBirth){
        super();
        this.setId(id);
        this.setNationalId(nationalId);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDateOfBirth(dateOfBirth);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
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
}
