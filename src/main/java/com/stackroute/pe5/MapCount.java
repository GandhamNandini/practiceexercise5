package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class MapCount {
    public Map<String,Integer> stringCount(String input){
        Map<String,Integer> map=new HashMap<String, Integer>();
        String[] array=input.split("[\\W_]+"); //splitting the given string into words
        for(String i:array){                 //if array has a repeated word count of the number
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);         //count is incremented
            } else {
                map.put(i, 1);                         //else return 1
            }
        }

        return map;
    }
}
