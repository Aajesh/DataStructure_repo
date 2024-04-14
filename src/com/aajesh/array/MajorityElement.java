package com.aajesh.array;
/*
 *Given an array you need to find the majority of element ihn the array
 *
 * Majority element is defined as the element which is appearing more than n/2
 *time in array of length n
 *
 * note : if there is no majority element return -1
 *
 * T c = o(n)
 * t s= o(1)
 *
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr ={5,7,2,7,4,2,5,2,4,2,4,4,2,2,2,2,2,2,2,2};
        System.out.println(findMajorityOfElement(arr, arr.length));
    }

    private static int findMajorityOfElement(int[] arr, int n) {
        int candidate = arr[0];
        int count=1;

        for (int i = 1; i < n; i++) {
            if(arr[i]==candidate){
                count++;
            }else{
                count--;
            }
            if(count==0){
                 candidate = arr[i];
                 count=1;
            }
        }
        //verify if candidate is your ans or not
        count =0;
        for (int val : arr) {
            if (val==candidate) {
                count++;
            }
        }
        if(count > n/2){
            return candidate;
        }else{
            return -1;
        }
    }//end of method
}//end of class