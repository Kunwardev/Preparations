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
public class MaxSumIncreasingSubsequence
{
    private int function(int[] arr){
        int[] msis = new int[arr.length];
        for(int i=0;i<arr.length;i++)
            msis[i] = arr[i];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j] && msis[i] < msis[j] + arr[i]){
                    msis[i] = arr[i] + msis[j];
                }
            }
        }
        int max = msis[0];
        for(int i=1;i<arr.length;i++){
            if(msis[i] > max)
                max = msis[i];
        }
        return max;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 101, 2, 3, 100, 4, 5};
        MaxSumIncreasingSubsequence m = new MaxSumIncreasingSubsequence();
        System.out.println(m.function(arr));
    }
    
}
