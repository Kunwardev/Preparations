/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Sorting;

/**
 *
 * @author Kunwar
 */
public class SecondSmallest
{
    private int function(int[] arr){
        int largest = Integer.MIN_VALUE;
        int larger = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(largest < arr[i])
                largest = arr[i];
            else if(larger < arr[i])
                larger = arr[i];
        }
        return larger;
    }
    
    public static void main(String[] args)
    {
        SecondSmallest s = new SecondSmallest();
        int[] arr = new int[]{12, 35, 1, 10, 34, 1};
        System.out.println(s.function(arr));
    }
    
}
