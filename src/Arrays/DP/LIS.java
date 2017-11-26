/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.DP;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class LIS
{
    private int function(int[] arr){
        int[] tailIndex = new int[arr.length];
        int[] prevIndex = new int[arr.length];
        Arrays.fill(tailIndex, 0);
        Arrays.fill(prevIndex, -1);
        int len = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[tailIndex[0]])
                tailIndex[0] = i;
            else if(arr[i] > arr[tailIndex[len-1]]){
                prevIndex[i] = tailIndex[len-1];
                tailIndex[len++] = i;
            }else{
                int pos = getCeilIndex(arr, tailIndex, -1, len-1, arr[i]);
                prevIndex[i] = tailIndex[pos-1];
                tailIndex[pos] = i;
            }
        }
        
        for(int i=tailIndex[len-1];i>=0;i=prevIndex[i])
            System.out.print(arr[i]+" ");
        
        return len;
    }

    private int getCeilIndex(int[] arr, int[] tailIndex, int l, int r, int key)
    {
        while(r-l > 1){
            int m = l + (r-l)/2;
            if(arr[tailIndex[m]] >= key)
                r = m;
            else
                l = m;
        }
        return r;
    }
    
    public static void main(String[] args)
    {
        LIS l = new LIS();
        int[] arr = new int[]{2, 5, 3, 7, 11, 8, 10, 13, 6};
        l.function(arr);
    }
    
}
