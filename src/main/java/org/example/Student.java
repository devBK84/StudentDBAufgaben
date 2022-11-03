package org.example;

public abstract class Student {

    private String name;
    private int id;

    //Jeder Student hat einen Namen und eine Id
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (getId() != student.getId()) return false;
        return getName() != null ? getName().equals(student.getName()) : student.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getId();
        return result;
    }

    // Mache deine Student Klasse zu einer abstrakten Klasse.
    // Füge der Klasse Student eine abstracte Methode hinzu. Lasse diese von deiner ComputerScienceStudent Klasse implementieren.

    public abstract String getCourse();
}


