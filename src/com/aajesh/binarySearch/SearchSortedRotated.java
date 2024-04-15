package com.aajesh.binarySearch;

import java.util.Scanner;

/*
 * Given a sorted rotated array of unique elements and a target.
 * find the index of target in the array
 *
 * if target is not present in the array return -1
 *
 *
 * Sample input
 * arr ={9,11,14,15,20,22,25,1,2,3,5,7}
 * target =14
 * sample output : 2
 * */
@SuppressWarnings("ALL")
public class SearchSortedRotated {

    public static void main(String[] args) {

        int[] arr = {9, 11, 14, 15, 20, 22, 25, 1, 2, 3, 5, 7};
        Scanner scanner= new Scanner(System.in);
        int target=scanner.nextInt();
        int minidex = findIn(arr);

        int ans = binarySearch(arr, 0, minidex - 1, target);
        if (ans == -1) {
            ans = binarySearch(arr, minidex, arr.length - 1, target);
        }
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private static int findIn(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < right) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }//end find
}
