package com.aajesh.array;
import java.util.Scanner;

/*
* Smallest Number Whose Product of Digit is N
* Given the positive number N. you need to find the smallest number S such that Product
* of digit of  is equal to N
*
* Sample Input  N =1000
* out : 5558
*
* TC=o(long n)
* Sp=0(0)
* */
public class PositiveNumber{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input =scanner.nextInt();
        System.out.println(solution(input));
    }

    private static  int solution(int input) {
        String ans="";
        for (int div = 9; div>=2; div--) {
            while(input%div ==0){
                input = input / div;
                ans = div + ans;
            }
        }
        if(input != 1){
            return -1;
        }else{
            return Integer.parseInt(ans);
        }
    }//end method
}