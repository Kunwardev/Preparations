/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Optimize;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class MinimizetheMaxDifference
{
    private int function(int[] arr, int k){
        Arrays.sort(arr);
        int length = arr.length;
        int ans = arr[length -1] - arr[0];
        int small = arr[0] + k;
        int big = arr[length-1] - k;
        int temp = 0;
        if(small > big){
            temp = small;
            small = big;
            big = temp;
        }
        
        for(int i=1;i<length-1;i++){
            int subtract = arr[i] - k;
            int add = arr[i] + k;
            
            if(subtract >= small || add <= big)
                continue;
            if(big-add >= subtract-small)
                small = subtract;
            else
                big = add;
        }
        return Math.min(ans, big-small);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 10, 14, 14, 14, 15};
        MinimizetheMaxDifference m = new MinimizetheMaxDifference();
        System.out.println(m.function(arr, 3));
    }
    
}
