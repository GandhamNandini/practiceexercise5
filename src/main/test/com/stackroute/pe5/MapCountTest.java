package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapCountTest {
    MapCount testobj;
    @Before
    public void setUp(){
        testobj=new MapCount();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    //return the count of words
    public void testmapCount(){
        Map<String,Integer> result=testobj.stringCount("one_one*two@three");
        Map<String,Integer> expected=new HashMap<String,Integer>();
        expected.put("one",2);
        expected.put("two",1);
        expected.put("three",1);
        assertEquals(expected,result);

    }
    @Test
    //return the count of words
    public void testmapCount1(){
        Map<String,Integer> result=testobj.stringCount("one& one^two =three$four");
        Map<String,Integer> expected=new HashMap<String,Integer>();
        expected.put("one",2);
        expected.put("two",1);
        expected.put("three",1);
        expected.put("four",1);
        assertEquals(expected,result);

    }
}