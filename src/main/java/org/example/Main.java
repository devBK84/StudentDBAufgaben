package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Schreibe für alle Methoden Tests (bis auf randomStudent() )
        ArrayList<Student>testStudentList = new ArrayList<>();
//        testStudentList.add(new Student("Dieter",0));
//        testStudentList.add(new Student("Frank",0));
//        testStudentList.add(new Student("Olaf", 0));
        StudentDB testDB = new StudentDB(testStudentList);

//        System.out.println(testDB.rendomStudent());
//        System.out.println(testDB.toString());

        // CSStudent
        Student csStudent = new ComputerScienceStudent("Zorro", 33, true, 200);
        System.out.println(csStudent);



    }





}