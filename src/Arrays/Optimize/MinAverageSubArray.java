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
public class MinAverageSubArray
{
    private void function(int[] arr, int k){
        int curr_sum = 0,max, min_idx = 0, max_idx = k-1;
        for(int i=0;i<k;i++){
            curr_sum += arr[i];
        }max = curr_sum;
        for(int i=k;i<arr.length;i++){
            curr_sum -= (arr[i-k] + arr[i]);
            if(curr_sum < max){
                max = curr_sum;
                min_idx = i-k;
                max_idx = i-1;
            }
        }
        System.out.println(min_idx+" "+max_idx);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{3, 7, 90, 20, 10, 50, 40};
        MinAverageSubArray m = new MinAverageSubArray();
        m.function(arr, 3);
    }
    
}
