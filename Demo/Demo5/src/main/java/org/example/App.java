package org.example;

import static org.example.BubbleSortExample.bubbleSort;
import static org.example.BubbleSortExample.printArray;

public class App
{
    public static void main( String[] args )
    {
        int [] arr={64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted Array:");
        printArray(arr);

        bubbleSort(arr);
        System.out.println("Sorted Array");
        printArray(arr);


    }
}

