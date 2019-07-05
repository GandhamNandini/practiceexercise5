package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortedSetTest {
    SortedSet s;
    @Before
    public void setUp() throws Exception {
        s = new SortedSet();
    }

    @After
    public void tearDown() throws Exception {
        s=null;
    }

    @Test
                            //names
    public void sort() {
        ArrayList<String> result=s.sort("nandini abc a cd");
        ArrayList<String> h=new ArrayList<String>();
        h.add("a");
        h.add("abc");
        h.add("cd");
        h.add("nandini");
        assertEquals(h,result);
    }


    @Test(expected = NullPointerException.class)
                                //no value
    public void sort1() {
        ArrayList<String> result=s.sort(null);

    }

    @Test
                                //digits
    public void sort2() {
        ArrayList<String> result=s.sort("6 7 8 9 0");
        ArrayList<String> h=new ArrayList<String>();
        h.add("0");
        h.add("6");
        h.add("7");
        h.add("8");
        h.add("9");
        assertEquals(h,result);
    }


    @Test
                                //special characters
    public void sort3() {
        ArrayList<String> result=s.sort("@ $ ^ !");
        ArrayList<String> h=new ArrayList<String>();
        h.add("!");
        h.add("$");
        h.add("@");
        h.add("^");
        assertEquals(h,result);
    }

    @Test
    //negative numbers
    public void sort4() {
        ArrayList<String> result=s.sort("-2 -3 -1 -5");
        ArrayList<String> h=new ArrayList<String>();
        h.add("-1");
        h.add("-2");
        h.add("-3");
        h.add("-5");
        assertEquals(h,result);
    }


}