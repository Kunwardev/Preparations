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
public class MaxLengthBitonicArray
{
    private int findLength(int[] arr){
        int[] left = new int[arr.length];
        int[] right= new int[arr.length];
        left[0] = 1;
        right[arr.length-1] = 1;
        for(int i=1;i<arr.length;i++)
            if(arr[i] > arr[i-1])
                left[i] = left[i-1] + 1;
            else
                left[i] = 1;
        for(int i=arr.length-2;i>=0;i--)
            if(arr[i] > arr[i+1])
                right[i] = right[i+1] + 1;
            else
                right[i] = 1;
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(left[i]+right[i]-1 > max)
                max = left[i]+right[i]-1;
        }
        return max;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{12, 4, 78, 90, 45, 23};
        MaxLengthBitonicArray m = new MaxLengthBitonicArray();
        System.out.println(m.findLength(arr));
    }
    
}
