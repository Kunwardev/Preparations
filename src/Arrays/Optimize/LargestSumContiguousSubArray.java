/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Optimize;

/**
 *
 * @author Kunwar
 */
public class LargestSumContiguousSubArray
{
    
    private int function(int[] arr){
        int max_so_far = 0, max_ending = 0;
        for(int i=0;i<arr.length;i++){
            max_ending += arr[i];
            if(max_ending < 0)
                max_ending = 0;
            if(max_so_far > max_ending)
                max_so_far = max_ending;
        }
        return max_so_far;
    }
    
    public static void main(String[] args)
    {
        LargestSumContiguousSubArray l = new LargestSumContiguousSubArray();
        int[] arr = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(l.function(arr));
    }
    
}
