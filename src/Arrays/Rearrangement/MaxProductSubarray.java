/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Rearrangement;

/**
 *
 * @author Kunwar
 */
public class MaxProductSubarray
{
    private int maxSubArray(int[] arr){
        int n = arr.length;
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for(int i=0;i<n;i++){
            if(arr[i] > 0){
                max_ending_here = max_ending_here * arr[i];
                min_ending_here = Math.min(min_ending_here*arr[i], 1);
            }else if(arr[i] == 0){
                max_ending_here = 1;
                min_ending_here = 1;
            }else{
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr[i], 1);
                min_ending_here = temp * arr[i];
            }
            
            if(max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            
        }
        return max_so_far;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, -2, -3, 0, 7, -8, -2};
        MaxProductSubarray m = new MaxProductSubarray();
        System.out.println(m.maxSubArray(arr));
    }
    
}
