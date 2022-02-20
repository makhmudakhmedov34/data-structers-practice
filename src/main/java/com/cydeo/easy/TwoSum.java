package com.cydeo.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] myArray = {2, 7, 9, 11};
        int target = 9;
        System.out.println("Two sum first solution");
        System.out.println(Arrays.toString(twoSumSolution1(myArray,target)));
        System.out.println("Two sum second solution");
        System.out.println(Arrays.toString(twoSumSolution2(myArray,target)));

    }

    // solution one
    public static int[] twoSumSolution1(int[] array,int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            int potentialMatch = target - array[i];
            if(map.containsKey(potentialMatch)) return new int[]{i,map.get(potentialMatch)};
              else map.put(array[i],i);
        }
        return new int[]{};
    }

    // solution two

    public static int[] twoSumSolution2(int[] array,int target){

        Arrays.sort(array);

        int firstPointer = 0;
        int lastPointer = array.length-1;
        while(firstPointer<lastPointer){
            int sum = array[firstPointer] + array[lastPointer];
            if(sum==target) return new int[]{array[firstPointer],array[lastPointer]};
            else if(sum<target) firstPointer++;
            else lastPointer--;
        }
       return new int[]{};
    }

}
