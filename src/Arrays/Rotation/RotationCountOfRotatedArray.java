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
public class RotationCountOfRotatedArray
{
    private int countRotations(int[] arr, int low, int high){
        if(high < low)
            return 0;
        if(high == low)
            return low;
        int mid = low + (high - low)/2;
        if(mid < high && arr[mid] > arr[mid+1])
            return mid+1;
        if(mid > low && arr[mid] < arr[mid-1])
            return mid;
        if(arr[mid] < arr[high])
            return countRotations(arr, low, mid-1);
        return countRotations(arr, mid+1, high);
    }
    
    public static void main(String[] args)
    {
        RotationCountOfRotatedArray r = new RotationCountOfRotatedArray();
        int[] arr = new int[]{15,18,1,2,6,12};
        System.out.println(r.countRotations(arr, 0, arr.length-1));
    }
    
}
