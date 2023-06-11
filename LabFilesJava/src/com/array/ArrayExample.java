package com.array;
import java.util.Arrays;
public class ArrayExample {
    public static void main(String[] args) {
        // Declaration and creation of an array
        int[] numbers = new int[5];

        // Initializing array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing array elements
        int firstElement = numbers[0]; // Retrieves the value 10

        // Modifying array elements
        numbers[1] = 25; // Changes the value at index 1 to 25

        // Array length
        int length = numbers.length; // Retrieves the length of the array, which is 5

        // Iterating over an array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Arrays class methods
        int[] numbersCopy = Arrays.copyOf(numbers, 9); // Creates a copy of the array
        System.out.println(numbersCopy.length);

        boolean contains30 = Arrays.asList(numbers).contains(30); // Checks if the array contains a specific value
        System.out.println(contains30);

        Arrays.sort(numbers); // Sorts the array in ascending order

        int index = Arrays.binarySearch(numbers, 40); // Searches for a value in the sorted array and returns its index

        // Multi-dimensional arrays
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // Printing a multi-dimensional array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


//        Declaration, creation, and initialization of an array.
//        Accessing and modifying array elements.
//                Retrieving the length of an array.
//                Iterating over an array using a for loop.
//                Using the Arrays class methods:
//        copyOf() method to create a copy of an array.
//        asList() method to convert an array into a List and check if it contains a specific value.
//                sort() method to sort the array.
//                binarySearch() method to search for a value in a sorted array and return its index.
//                Working with multi-dimensional arrays:
//        Declaration, creation, and initialization of a 2D array.
//                Printing the contents of a 2D array.
    }
}
