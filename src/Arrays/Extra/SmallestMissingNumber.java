/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Extra;

/**
 *
 * @author Kunwar
 */

// Given a Sorted Array, find the smallest missing number

public class SmallestMissingNumber
{
    private int function(int[] arr, int start, int end){
        if(start > end)
            return end+1;
        if(start != arr[start])
            return start;
        int mid = (start + end)/2;
        if(arr[mid] == mid)
            return function(arr, mid+1, end);
        return function(arr, start, mid);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5};
        SmallestMissingNumber s = new SmallestMissingNumber();
        System.out.println(s.function(arr, 0, arr.length-1));
    }
    
}
