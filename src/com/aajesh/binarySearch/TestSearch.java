package com.aajesh.binarySearch;


/*
* First and Last Position of X
*
* Given sorted array and a target. you need to find the first and last position of that traget in the array
*Note: if target is not present sent in the array, return-1
*
* input: N=10
*
* arr={2,3,3,4,5,5,5,5,5,8}
*
* target =4 8
* output :
*
* time com : o(logn)
* space com : O(1)
* */


public class TestSearch {
    public static void main(String[] args) {
       int[] arr={2,3,3,4,5,5,5,5,5,5,8};
       int target =7;
       findAndLastPosition(arr,target);
    }
    private static void findAndLastPosition(int[] arr, int target) {

        /*Left position of the array */
        int left=0;
        int right=arr.length-1;
        int first=-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                first=mid;
                right=mid-1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }

/* Right position to Search the data */
        left=0;
        right=arr.length-1;
        int last=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                last=mid;
                left=mid+1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }

        System.out.println("first : "+first+"  Last :"+last);
    }
}
