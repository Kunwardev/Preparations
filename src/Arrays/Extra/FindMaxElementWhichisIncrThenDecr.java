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
public class FindMaxElementWhichisIncrThenDecr
{
    private int function(int[] arr, int low, int high){
        /* Base Case: Only one element is 
          present in arr[low..high]*/
       if (low == high)
         return arr[low];
      
       /* If there are two elements and 
          first is greater then the first 
          element is maximum */
       if ((high == low + 1) && arr[low] >= arr[high])
          return arr[low];
      
       /* If there are two elements and 
          second is greater then the second 
          element is maximum */
       if ((high == low + 1) && arr[low] < arr[high])
          return arr[high];
         
       /*low + (high - low)/2;*/
       int mid = (low + high)/2;   
      
       /* If we reach a point where arr[mid] 
          is greater than both of its adjacent 
          elements arr[mid-1] and arr[mid+1], 
          then arr[mid] is the maximum element*/
       if ( arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
          return arr[mid];
      
       /* If arr[mid] is greater than the next 
          element and smaller than the previous 
          element then maximum lies on left side 
          of mid */
       if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1])
         return function(arr, low, mid-1);
       else
         return function(arr, mid+1, high);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 3, 50, 10, 9, 7, 6};
        FindMaxElementWhichisIncrThenDecr f = new FindMaxElementWhichisIncrThenDecr();
        System.out.println(f.function(arr, 0, arr.length-1));
    }
    
}
