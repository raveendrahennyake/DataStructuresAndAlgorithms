package org.example;

public class BubbleSortExample {
    public static void bubbleSort (int [] arr){
        int length=arr.length;
        boolean swapping;

        //Outer loop
        for(int i=0;i<length-1;i++){
            swapping=false;
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                    swapping=true;
                }
            }
            if (!swapping) {
                break;
            }
        }

    }

    public static void printArray (int [] arr){
        for (int num :arr){
            System.out.println(num + "");
        }

    }

}
