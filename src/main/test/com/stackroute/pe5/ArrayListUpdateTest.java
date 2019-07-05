package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListUpdateTest {
    ArrayListUpdate testobj;
    @Before
    public void setUp(){
        testobj=new ArrayListUpdate();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    //indexes are replaced with given string
    public void changeArrayList(){
        ArrayList<String> list=testobj.arraylist(new String[]{"apple","grape","melon","berry"},new int[]{0,2},new String[]{"kiwi","mango"});
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("kiwi");
        expected.add("grape");
        expected.add("mango");
        expected.add("berry");
        assertEquals(expected,list);
        System.out.println(list);
        ArrayList <String> empty=new ArrayList<String>();
        ArrayList<String> res=testobj.remove();
        assertEquals(empty,res);
        System.out.println(res);
    }
    @Test
    //indexes are replaced with given string
    public void testChangeArrayList(){
        ArrayList<String> list=testobj.arraylist(new String[]{"apple","grape","melon","berry"},new int[]{0,2},new String[]{"mango"});
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("apple");
        expected.add("grape");
        expected.add("melon");
        expected.add("berry");
        assertEquals(expected,list);
        System.out.println(list);
        ArrayList <String> empty=new ArrayList<String>();
        ArrayList<String> res=testobj.remove();
        assertEquals(empty,res);
        System.out.println(res);
    }
    @Test
    //indexes are replaced with given string
    public void testNullInputArrayList(){
        ArrayList<String> list=testobj.arraylist(new String[]{"abc","de","fg","hij"},new int[]{0,2},new String[]{"xyz"," "});
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("xyz");
        expected.add("de");
        expected.add(" ");
        expected.add("hij");
        assertEquals(expected,list);
        System.out.println(list);
        ArrayList <String> empty=new ArrayList<String>();
        ArrayList<String> res=testobj.remove();
        assertEquals(empty,res);
        System.out.println(res);
    }
    @Test
    //indexes are replaced with given string
    public void testInputArrayList(){
        ArrayList<String> list=testobj.arraylist(new String[]{"123","45","67","89"},new int[]{1},new String[]{"mno"});
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("123");
        expected.add("mno");
        expected.add("67");
        expected.add("89");
        assertEquals(expected,list);
        System.out.println(list);
        ArrayList <String> empty=new ArrayList<String>();
        ArrayList<String> res=testobj.remove();
        assertEquals(empty,res);
        System.out.println(res);
    }
    @Test (expected =IndexOutOfBoundsException.class  )

    public void testNegativeInputArrayList(){
        ArrayList<String> list=testobj.arraylist(new String[]{"123","45","67","89"},new int[]{10},new String[]{"mno"});
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("123");
        expected.add("mno");
        expected.add("67");
        expected.add("89");
        assertEquals(expected,list);
        System.out.println(list);
        ArrayList <String> empty=new ArrayList<String>();
        ArrayList<String> res=testobj.remove();
        assertEquals(empty,res);
        System.out.println(res);
    }


}