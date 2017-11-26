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
public class MinLengthSubArraySum
{
    private int function(int[] arr, int sum){
        int i = 0, j = 0, curr_sum = 0, min_len = Integer.MAX_VALUE;
        while(j < arr.length){
            while(curr_sum <= sum && j < arr.length)
                curr_sum += arr[j++];
            while(curr_sum > sum && i < arr.length){
                if(j-i < min_len){
                    min_len = (j-i);
                }
                curr_sum -= arr[i++];
            }
        }
        return min_len;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 4, 45, 6, 10, 19};
        int x = 51;
        MinLengthSubArraySum m = new MinLengthSubArraySum();
        System.out.println(m.function(arr, x));
    }
    
}
