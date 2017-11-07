/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Rotation;

/**
 *
 * @author Kunwar
 */
public class ArrayRotationUsingReversal
{
    private void reverseArray(int[] arr, int start, int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
    }
    
    private void rotate(int[] arr, int d){
        
        /*
            Reverse A to get ArB.  Ar is reverse of A 
            //Reverse B to get ArBr.  Br is reverse of B 
            //Reverse all to get (ArBr) r = BA.
        */
        
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, arr.length-1);
        reverseArray(arr, 0, arr.length-1);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        ArrayRotationUsingReversal a = new ArrayRotationUsingReversal();
        a.rotate(arr, 2);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
