package org.example;

public class BiologyStudent extends Student implements Citizen{
    public BiologyStudent(String name, int id) {
        super(name, id);
    }

    @Override
    public String getCourse() {
        return this.getCourse();
    }

    @Override
    public String getAdress() {
        return "Mashroom";
    }

    @Override
    public int getIdentityCardNumber() {
        return 96;
    }
}
