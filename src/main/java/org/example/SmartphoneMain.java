package org.example;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneMain {
    public static void main(String[] args) {
        List<Contact>contactList = new ArrayList<>();
        contactList.add(new Frienddie("Steve Jobs",911));
        contactList.add(new Frienddie("Mark Zuckerberg",666));

        Smartphone Kackaphone = new Smartphone("Schimmel","MarsX",contactList);
        System.out.println(Kackaphone);
    }
}
