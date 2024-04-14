package com.aajesh.array;

/*
* SpiralMatrix
* */
public class SpiralMatrix {

    public static void main(String[] args) {
//        int[][] arr={{1,2,3,4},
//                     {5,6,7,8},
//                     {9,10,11,12},
//                    {13,14,15,16}};


        int[][] arr={{1,2,3,4,5},
                    {6,7,8,9,10},
                    {11,12,13,14,15}};
        spiralMatrix_test(arr);
       // print(arr);
    }

    private static void print(int[][] arr) {

        for (int[] a: arr){
            for (int val : a){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }

    private static void spiralMatrix_test(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;

        int rmin=0, rmax= arr.length-1;
        int cmin=0, cmax= arr[0].length-1;

        System.out.println("rmax :"+rmax);
        System.out.println("cmax :"+cmax);

        int count=0;

        while(count < n*m){
            //top boundary
            for (int col = cmin; col <=cmax && count < n*m; col++) {
                System.out.print(arr[rmin][col]+" "); //1,2,3,4,5
                count++;
            }
            //System.out.println();
            rmin++;
            //System.out.println("rmin :"+rmin);
            //right boundary
            for (int row = rmin; row <=rmax && count < n*m; row++) {
                System.out.print(arr[row][cmax]+" ");  //10,15
                count++;
            }
            //System.out.println();
            cmax--;

            //bottom boundary
            for (int col = cmax; col >=cmin && count < n*m; col--) {
                System.out.print(arr[rmax][col]+" ");  //14,13,12,11
                count++;
            }

           // System.out.println();
            rmax--;
           // System.out.println("rmax :"+rmax+" rmin "+rmin);
            //left boundary
            for (int row = rmax; row >=rmin && count < n*m; row--) {
                 System.out.print(arr[row][cmin]+" ");
                count++;
            }
            cmin++;
        }
    }//end of method
}