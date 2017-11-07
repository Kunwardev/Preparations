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
public class ReverseArray
{
    private void reverseArray(int[] arr, int start, int end){
        if(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start+1, end-1);
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6};
        ReverseArray r = new ReverseArray();
        r.reverseArray(arr, 0, arr.length-1);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
