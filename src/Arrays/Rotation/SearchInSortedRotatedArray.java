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
public class SearchInSortedRotatedArray
{
    private int findPivot(int[] arr, int low, int high){
        
        if(high < low)
            return -1;
        if(high == low)
            return low;
        int mid = (low+high)/2;
        if(mid < high && arr[mid] > arr[mid+1])
            return mid;
        if(mid > low && arr[mid] < arr[mid-1])
            return (mid-1);
        if(arr[low] >= arr[mid])
            return findPivot(arr, low, mid-1);
        return findPivot(arr, mid+1, high);
    }
    
    private int pivotedBinarySearch(int[] arr, int key){
        int pivot = findPivot(arr, 0, arr.length-1);
        if(arr[pivot] == key)
            return pivot;
        if(arr[0] <= key)
            return binarySearch(arr, 0, pivot-1, key);
        return binarySearch(arr, pivot+1, arr.length-1, key);
    }

    private int binarySearch(int[] arr, int low, int high, int key)
    {
        if(low > high)
            return -1;
        int mid = (low + high)/2;
        if(arr[mid] == key)
            return mid;
        if(arr[mid] > key)
            return binarySearch(arr, low, mid-1, key);
        return binarySearch(arr, mid+1, high, key);
    }
    
    public static void main(String[] args)
    {
        SearchInSortedRotatedArray s = new SearchInSortedRotatedArray();
        int[] arr = new int[]{6,7,1,2,3,4,5};
        System.out.println(s.pivotedBinarySearch(arr, 4));
    }
    
}
