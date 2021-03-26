package com.alphacoder.array.util;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayUtil {

    private ArrayUtil(){

    }

    public static int countNoOfDuplicates(List<Integer> numbers){
        int count= 0;
        List<Integer> duplicateNumbers= new ArrayList<>();

        for(int i=0; i<numbers.size(); i++){
            for(int j=i+1; j<numbers.size(); j++){
                if(numbers.get(i).equals(numbers.get(j))){
                    if(!duplicateNumbers.contains(numbers.get(i))){
                        duplicateNumbers.add(numbers.get(i));
                        count++;
                        break;
                    }
                }
            }
        }

        //Print the duplicate numbers.
        System.out.println(duplicateNumbers);

        return count;
    }
}
