package org.example;

public class StarPyramid {
    public static void main(String[] args) {
        // Call the method to print the pyramid
        printPyramids(10);  // You can change the size here
    }
    
    /**
     * Prints a pyramid pattern with the specified number of rows
     * @param size The number of rows in the pyramid
     */
    public static void printPyramids(int size) {
        // Loop through each row (1 to size)
        for (int i = 1; i <= size; i++) {
            // Print spaces before stars
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            // Move to next line
            System.out.println();
        }
    }
}
