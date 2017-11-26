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
public class LongestContinuousof1inArray 
{
    private int function(int[] arr){
        int max_count = 0;
        int max_index = 0;
        int prev_zero = -1;
        int prev_prev_zero = -1;
        for(int curr=0;curr<arr.length;curr++){
            if(arr[curr] == 0){
                if(curr - prev_prev_zero > max_count){
                    max_count = (curr - prev_prev_zero);
                    max_index = prev_zero;
                }
                prev_prev_zero = prev_zero;
                prev_zero = curr;
            }
        }
        if(arr.length - prev_prev_zero > max_count)
            max_index = prev_zero;
        return max_index;
    }
    
    public static void main(String[] args)
    {
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1};
        LongestContinuousof1inArray l = new LongestContinuousof1inArray();
        System.out.println(l.function(arr));
    }
    
}
