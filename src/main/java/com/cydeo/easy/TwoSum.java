package com.cydeo.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] myarray = {2, 7, 9, 11};

    }

    // solution one
    public int[] twoSumSolution1(int[] array,int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            int potentialMatch = target - array[i];
            if(potentialMatch==array[i]) return new int[]{i,map.get(potentialMatch)};
              else map.put(array[i],i);
        }
        return new int[]{};
    }
}
