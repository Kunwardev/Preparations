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
public class FindPairInSortedRotatedArray
{
    // Find the max and min Elements which will be side by side
    // l is min Index, r = maxIndex
    // Other way to find Pivot element is in SearchInSortedRotatedArray
    private boolean findPair(int[] arr, int x){
        int i, n = arr.length;
        for(i=0;i<n-1;i++){
            if(arr[i] > arr[i+1])
                break;
        }
            int l = (i+1)%n;
            int r = i;
            
            while(l != r){
                if(arr[l] + arr[r] == x)
                    return true;
                if(arr[l] + arr[r] < x)
                    l = (l+1)%n;
                else
                    r = (n+r-1)%n;
            }
        return false;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{11, 15, 6, 8, 9, 10};
        int sum = 16;
        FindPairInSortedRotatedArray f = new FindPairInSortedRotatedArray();
        System.out.println(f.findPair(arr, 16));
    }
    
}
