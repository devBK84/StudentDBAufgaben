package org.example;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements GPS, Radio{

    String brand;
    String modelname;

    List<Contact> contactList;

    public Smartphone() {
    }

    public Smartphone(String brand, String modelname, List<Contact> contactList) {
        this.brand = brand;
        this.modelname = modelname;
        this.contactList = contactList;
    }

    @Override
    public String getPostion() {
        return "Köln";
    }

    @Override
    public void starterRadio() {
        System.out.println("Radio started");
    }

    @Override
    public void stopRadio() {
        System.out.println("Radio stopped");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brand='" + brand + '\'' +
                ", modelname='" + modelname + '\'' +
                ", contactList=" + contactList +
                '}';
    }

}
