package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class StringArrayCount {
    public Map<String,Boolean> countArray(String[] input){
        Map<String,Boolean> m=new HashMap<String,Boolean>();
        //see if there are repeated words in the string
        for(int i=0;i<input.length;i++){
            int count=0;
            for(int j=0;j<input.length;j++){      //if repeated increment count
                if(input[i].equals(input[j])) {
                    count++;
                }
            }

            if(count>=2) {          //if count is >=2then return true
                m.put(input[i],true);
            }
            else{
                m.put(input[i],false);
            }

        }
        return m;
    }
}
