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
public class MaxSumInArray
{
    private int maxSum(int[] arr, int l, int h, int r){
        int sum = 0;
        for(int i=l;i<=r;i++)
            sum += arr[i];
        return sum;
    }
    
    private int maxSubSum(int[] arr, int l, int h){
        if(l == h)
            return arr[l];
        int m = (l+h)/2;
        return Math.max(Math.max(maxSubSum(arr, l, m), maxSubSum(arr, m+1, h)), 
                maxSum(arr,l,m,h));
    }
    
    public static void main(String[] args)
    {
        MaxSumInArray m = new MaxSumInArray();
        int[] arr = new int[]{-2, -5, 6, -2, -3, 1, 5, -6};
        System.out.println(m.maxSubSum(arr, 0, arr.length-1));
    }
    
}
