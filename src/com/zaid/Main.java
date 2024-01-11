package com.zaid;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr=new int[5]; //Creating an Array.

        //Access Array using traditional for loop
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= sc.nextInt();
        }

        //Access Array using  for-each loop
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        //Access Array using  Arrays.toString() method.
        System.out.println(Arrays.toString(arr));

        //Creating 2D Arrays.
        int [][] arr2D=new int[3][];

        //Using traditional for loop
        for (int rows = 0; rows < arr2D.length; rows++) {
            for (int cols = 0; cols < arr2D[rows].length; cols++) {
                arr2D[rows][cols]= sc.nextInt();
            }
        }

        //Using for each loop
        for(int [] elem :arr2D){
            System.out.println(Arrays.toString(elem));
        }



    }
}
