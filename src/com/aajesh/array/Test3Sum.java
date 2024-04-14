package com.aajesh.array;

import java.util.Arrays;

/*
*Given an array of size N and an integer target find all the triplet(a[i], a[j], a[k])
* such arr[i]+arr[j]+arr[k]=target and i!=j!=k
*
*Note  : Solution must contain unique triplet
*
* N =7
* arr={7, -6 ,3, 8, -1, 8, -1}
* target =0
*
* output [-11,3,8], [-6,-1,7]
* */
public class Test3Sum {

    public static void main(String[] args) {
       //int[] arr={7, -6, 3, 8, -1, 8, -1};
       int[] arr={7, -6, 3, 8, -1, 8, -11};
       int target =0;
       solution(arr, target, arr.length);
    }
    private static void solution(int[] arr, int target, int n) {
        Arrays.sort(arr);

        for (int i = 0; i <n ; i++) {
            if(i == 0 || (arr[i]!= arr[i-1])){
                int j=i+1, k=n-1;
                int newTarget= target-arr[i];
                while(j<k){
                    if(arr[j]+arr[k]==newTarget){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);

                        //ignoring duplicate
                        while (j<k && arr[j]==arr[j+1])j++;
                        while (j<k && arr[k]==arr[k-1])k--;
                        j++;
                        k--;
                    }else if(arr[j]+arr[k] <newTarget){
                        j++;
                    }else{
                        k--;
                    }
                }
            }// end if
        }//end for
    }//end method
}//end of class

/*
* Time complexcity O(n2)
* space complexcity 0(1)
* */