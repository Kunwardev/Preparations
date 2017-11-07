/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Rearrangement;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kunwar
 */
public class ShuffleGivenArray
{
    private void randomize( int arr[], int n)
    {
        // Creating a object for Random class
        Random r = new Random();
         
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n-1; i > 0; i--) {
             
            // Pick a random index from 0 to i
            int j = r.nextInt(i);
             
            // Swap arr[i] with the element at random index
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Prints the random array
        System.out.println(Arrays.toString(arr));
    }
     
    // Driver Program to test above function
    public static void main(String[] args) 
    {
         
         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
         int n = arr.length;
         ShuffleGivenArray s = new ShuffleGivenArray();
         s.randomize (arr, n);
         
    }
}
