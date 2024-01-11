package com.zaid;

import java.util.ArrayList;
import java.util.Scanner;

// Use ArrayList to create array of non-specified size.
public class Array_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Syntax
        ArrayList<Integer>  list = new ArrayList<Integer>(10);

        //Add items to ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //Add using for loop
        for (int i = 0; i <5 ; i++) {
            list.add(sc.nextInt());
        }

        //Display list items using for-loop{using get(index) function}
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }

        //Multidimensional Array list
        ArrayList<ArrayList<Integer>> list2=new ArrayList<ArrayList<Integer>>();

        //Initializing the ArrayList (with 3 ArrayLists)
        for (int i = 0; i < 3; i++) {
            list2.add(new ArrayList<>());
        }

        //Creating the 2D ArrayList by inserting elements into each row (Arraylist) of ArrayList.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2.get(i).add(sc.nextInt());
            }

        }
        System.out.println(list2);
    }
}
