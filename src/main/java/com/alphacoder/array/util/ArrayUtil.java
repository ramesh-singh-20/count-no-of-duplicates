package com.alphacoder.array.util;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayUtil {

    private ArrayUtil(){

    }

    public static int countNoOfDuplicates(List<Integer> numbers){
        int count= 0;
        List<Integer> numbersCopy= new ArrayList<>();

        for(int i=0; i<numbers.size(); i++){
            int currentElement= numbers.get(i);

            for(int j=i+1; j<numbers.size(); j++){
                int innerElement= numbers.get(j);
                if(numbers.get(i).equals(numbers.get(j))){
                    if(!numbersCopy.contains(numbers.get(i))){
                        numbersCopy.add(numbers.get(i));
                        count++;
                        break;
                    }
                }
            }
        }

        return count;
    }
}
