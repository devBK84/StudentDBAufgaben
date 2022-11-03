package org.example;

public class Frienddie extends Contact {

    private int phoneNumber;

    public Frienddie() {
    }

    public Frienddie(String name, int phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Frienddie{" +
                "phoneNumber=" + phoneNumber +
                ", name=" + this.getName() +
                '}';
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
