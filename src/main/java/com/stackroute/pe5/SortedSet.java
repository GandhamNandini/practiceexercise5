package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.TreeSet;

public class SortedSet {
    public ArrayList<String> sort(String s)
    {
        //tree set is initiialised
        TreeSet<String> set =new TreeSet<String>();
        String [] array=s.split(" ");       //words of a string are splitted
        for(int i=0;i<array.length;i++)
        {
            set.add(array[i]);      //splitted words are added into set.
        }
        ArrayList<String> arrayList=new ArrayList<String>(set);   //set is converted to arraylist
        return arrayList;
    }
}
