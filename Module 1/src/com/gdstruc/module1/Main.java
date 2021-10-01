package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 10;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 9;
        numbers[4] = 5;
        numbers[5] = 7;
        numbers[6] = 4;
        numbers[7] = 8;
        numbers[8] = 6;
        numbers[9] = 3;

        System.out.println("Before bubble sort and selection sort:");
        printArrayElements(numbers);

        bubbleSortDesc(numbers);

        System.out.println("\n\nBubble sort in descending order:");
        printArrayElements(numbers);

        bubbleSortAsc(numbers);

        System.out.println("\nBubble sort in ascending order:");
        printArrayElements(numbers);

        selectionSortAsc(numbers);

        System.out.println("\n\nSelection sort in ascending order:");
        printArrayElements(numbers);

        selectionSortDesc(numbers);

        System.out.println("\nSelection sort in descending order:");
        printArrayElements(numbers);
    }

    private static void bubbleSortDesc(int[] arr)
    {
        for (int lastSortedIndex = arr.length -1; lastSortedIndex >0; lastSortedIndex--)
        {
            for(int i = 0; i< lastSortedIndex; i++)
            {
                if(arr[i] < arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

    }

    private static void bubbleSortAsc(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex >0; lastSortedIndex--)
        {
            for(int i = 0; i< lastSortedIndex; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

    }

    private static void selectionSortAsc(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;

            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if(arr[i] > arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    private static void selectionSortDesc(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1 ; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for(int i = 0; i <= lastSortedIndex; i++)            {
                if(arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[lastSortedIndex];
            arr[lastSortedIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr){
        for (int j: arr) {
            System.out.print(j + " ");
        }
    }
}
