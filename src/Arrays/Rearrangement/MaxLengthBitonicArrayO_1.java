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
public class MaxLengthBitonicArrayO_1
{
    private int maxLenBitonic(int[] A,int n)
    {
        if (n == 0)
            return 0;
         
        // initializing max_len
        int maxLen=1;
         
        int start=0;
        int nextStart=0;
         
        int j =0;
        while (j < n-1)
        { 
            // look for end of ascent       
            while (j<n-1 && A[j]<=A[j+1])
                j++;
             
            // look for end of descent       
            while (j<n-1 && A[j]>=A[j+1]){
                 
                // adjusting nextStart;
                // this will be necessarily executed at least once,
                // when we detect the start of the descent
                if (j<n-1 && A[j]>A[j+1])
                    nextStart=j+1;
                 
                j++;
            }
             
            // updating maxLen, if required
            maxLen = Math.max(maxLen,j-(start-1));
             
            start=nextStart;
        }
         
        return maxLen;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{12, 4, 78, 90, 45, 23};
        MaxLengthBitonicArrayO_1 m = new MaxLengthBitonicArrayO_1();
        System.out.println(m.maxLenBitonic(arr, arr.length));
    }
    
}
