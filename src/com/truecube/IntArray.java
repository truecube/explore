package com.truecube;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntArray {


    static int findCombinations1(int[] iarr, int sum) {

        int count = 0;
        for (int i= 0; i < iarr.length; i++) {
            int out = iarr[i];
            for (int j=0; j <iarr.length; j++) {
                int in = iarr[j];
                if(sum == in + out) {
                    count++;
                }
            }
        }
        return count;
    }

    static int findCombinations2(int[] iarr, Integer sum) {
        int count = 0;

        Set<Integer> values = new HashSet<>();
        for(int i : iarr) {
            values.add(i);
        }

        for(Integer i : iarr) {
            if(values.contains(sum -i)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] iarr = new int[] {1,2,3,4,5,6,7,10,11,11,12,13,14,15,16};
        int sum = 25;
        long startTime = System.currentTimeMillis();
        System.out.println("Method1: found " + findCombinations1(iarr, sum) + " combinations that yeild sum=" + sum);
        long endTime = System.currentTimeMillis();
        System.out.println("time took: " + (endTime - startTime));
        startTime =  System.currentTimeMillis();
        System.out.println("Method2: found " + findCombinations2(iarr, sum) + " combinations that yeild sum=" + sum);
        endTime =  System.currentTimeMillis();
        System.out.println("time took: " + (endTime - startTime));
    }
}
