/*
Problem
Write a Java program that prompts the user to enter an array size and then input elements into the array. The program should then prompt the user to enter an index and try to display the element at that index. If the user enters an invalid index (an index that is out of bounds), the program should throw an ArrayIndexOutOfBoundsException and catch it using a try-catch block. When the exception is caught, print "Invalid index entered".

Input Format
The first line contains an integer, which is the size of the array.

The second line contains space-separated integers, which are the elements of the array.

The third line contains an integer, which is the index to be accessed.

Output Format
If the index is valid, print the element at the given index.

If an ArrayIndexOutOfBoundsException is thrown, catch it and print "Invalid index entered".

Do's
Use a try-catch block to handle the ArrayIndexOutOfBoundsException.
Print the message "Invalid index entered" when the exception occurs.
Use an array to store user input elements.
Sample Inputs & Outputs
Sample Input 1

5
10 20 30 40 50
2
Sample Output 1

30
Sample Input 2

3
1 2 3
5
Sample Output 2

Invalid index entered
*/

import java.util.*;

public class HandleArrayIndexException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read array size
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Step 2: Read array elements
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Read index to access
        int index = sc.nextInt();

        // Step 4: Try to access element and handle exception
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index entered");
        }
    }
}
