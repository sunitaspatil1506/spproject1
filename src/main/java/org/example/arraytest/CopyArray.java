package org.example.arraytest;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5}; // Initialize Array
        int[] arr2 = new int[arr1.length];  // Create an another array of size of arr1
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];        // Copying all elements of one array into another
        }
        System.out.println("Elements Of Original Array : ");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println("===========================================");
        System.out.println("Elements of a Duplicate Array");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+ " ");
        }

    }
}

