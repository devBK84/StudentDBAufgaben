package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @org.junit.jupiter.api.Test
    void getAllStudents() {

        ArrayList<Student>testStudentList = new ArrayList<>();
        testStudentList.add(new Student("Dieter",0));
        // Given
        StudentDB testDB = new StudentDB(testStudentList);


        // When
        ArrayList<Student> result = testDB.getAllStudents();



        ArrayList<Student>expected = new ArrayList<>();
        // Than
        expected.add(new Student("Dieter",0));
        assertEquals(expected,result);
    }
    @Test
    void testtoString(){
    // Given
     String expectedResult = "StudentDB{studentArrayList=[Student{name='Dieter', id=0}, Student{name='Frank', id=0}, Student{name='Olaf', id=0}]}";
        ArrayList<Student>testStudentList = new ArrayList<>();
        testStudentList.add(new Student("Dieter",0));
        testStudentList.add(new Student("Frank",0));
        testStudentList.add(new Student("Olaf",0));
        StudentDB testDB = new StudentDB(testStudentList);

        // When
        String result = testDB.toString();


        // Than

        assertEquals(expectedResult,result);
    }
}
