package com.aajesh.array;
import java.util.HashMap;
/*
*Given an array of size N and an integer target find the indices(i,j) of
*two numbers such that there sum is equal ot target (i!=j)
*you can assume that there will be exactly one solution
Sample input N
int[] arr = {11, 3, 7, 9, 14, 2};
Target 17
sample output : 1 4
* */
public class TestSum {
    public static void main(String[] args) {
        int[] arr = {11, 3, 7, 9, 14, 2};
        int[] output = new int[2];
        int target = 17;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // looking for second no
            int sno = target - arr[i];

            //if it present that mean i got my answer
            if (map.containsKey(sno)) {
                output[0] = map.get(sno);
                output[1] = i;
                break;
            }
            map.put(arr[i], i);
        }
        System.out.println(output[0] + " " + output[1]);
    }
}