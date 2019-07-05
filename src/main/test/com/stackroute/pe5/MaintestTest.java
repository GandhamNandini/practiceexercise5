package com.stackroute.pe5;
import org.junit.After;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MaintestTest {
    Maintest testobj;
    @Before
    public void setUp(){
        testobj=new Maintest();
    }
    @After
    public void tearDown() {
        testobj = null;
    }


    @Test
    //Should return in sorted order
    public void testStudentSort() {
        ArrayList<Student> student = new ArrayList<Student>();
        Student stu1 = new Student("100", "abc", 20);
        Student stu2 = new Student("101", "def", 20);
        Student stu3 = new Student("102", "def", 21);
        Student stu4 = new Student("103", "ghi", 21);
        Student stu5 = new Student("104", "ijk", 30);
        student.add(stu1);
        student.add(stu2);
        student.add(stu3);
        student.add(stu4);
        student.add(stu5);
        String result = Maintest.implementer(student);
        assertEquals("[Student{id='100', name='abc', age=20}, Student{id='101', name='def', age=20}, Student{id='102'," +
                " name='def', age=21}, Student{id='103', name='ghi', age=21}, Student{id='104', name='ijk', age=30}]", result);
    }


    @Test
    //Should return in sorted order
    public void testStudentSort1() {
        ArrayList<Student> student = new ArrayList<Student>();
        Student stu1 = new Student("1", "abc", 20);
        Student stu2 = new Student("1", "def", 20);
        Student stu3 = new Student("2", "def", 21);
        Student stu4 = new Student("3", "ghi", 21);
        Student stu5 = new Student("4", "ijk", 30);
        student.add(stu1);
        student.add(stu2);
        student.add(stu3);
        student.add(stu4);
        student.add(stu5);
        String result = Maintest.implementer(student);
        assertEquals("[Student{id='1', name='abc', age=20}, Student{id='1', name='def', age=20}, Student{id='2'," +
                " name='def', age=21}, Student{id='3', name='ghi', age=21}, Student{id='4', name='ijk', age=30}]", result);
    }


    @Test
    //Should return in sorted order
    public void testStudentSort2() {
        ArrayList<Student> student = new ArrayList<Student>();
        Student stu1 = new Student("1", " ", 20);
        Student stu2 = new Student("1", "abc", 20);
        Student stu3 = new Student("2", "def", 21);
        Student stu4 = new Student("3", "ghi", 21);
        Student stu5 = new Student("4", "ijk", 30);
        student.add(stu1);
        student.add(stu2);
        student.add(stu3);
        student.add(stu4);
        student.add(stu5);
        String result = Maintest.implementer(student);
        assertEquals("[Student{id='1', name=' ', age=20}, Student{id='1', name='abc', age=20}, Student{id='2'," +
                " name='def', age=21}, Student{id='3', name='ghi', age=21}, Student{id='4', name='ijk', age=30}]", result);
    }

}