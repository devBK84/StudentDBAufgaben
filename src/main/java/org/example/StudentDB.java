package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

//Erstelle eine Klasse StudentDB mit folgenden Eigenschaften
//Der Konstruktor nimmt eine ArrayList von Studenten entgegen
//Jeder Student hat einen Namen und eine Id
//Die Methode toString() gibt alle Studenten formatiert als String zurück


public class StudentDB {
    @Override
    public String toString() {
        return "StudentDB{" +
                "studentArrayList=" + studentArrayList +
                '}';
    }

    private ArrayList<Student>studentArrayList;
    public StudentDB(ArrayList<Student>newStudentsList){
        this.studentArrayList = newStudentsList;

    }
    //Die Methode getAllStudents gibt alle Studenten als ArrayList zurück

    public ArrayList<Student> getAllStudents() {
        return studentArrayList;
    }

    //Die Methode randomStudent() gibt einen zufälligen Studenten zurück (Nutze für den Zufall Math.random())
    public Student rendomStudent(){
        int mathRendom = ThreadLocalRandom.current().nextInt(0,this.studentArrayList.size());
        return this.studentArrayList.get(mathRendom);

    }
}
