/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Rearrangement;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class MaximizeSumConsecutiveDifferenceCircularArray
{
    private int function(int[] arr){
        Arrays.sort(arr);
        int length = arr.length;
        int sum = 0;
        for(int i=0;i<length/2;i++){
            sum -= 2 * arr[i];
            sum += 2 * arr[length-i-1];
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{4,2,1,8};
        MaximizeSumConsecutiveDifferenceCircularArray m = new MaximizeSumConsecutiveDifferenceCircularArray();
        System.out.println(m.function(arr));
    }
    
}
