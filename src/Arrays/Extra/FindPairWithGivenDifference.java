/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Extra;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class FindPairWithGivenDifference
{
    private boolean function(int[] arr, int diff){
        Arrays.sort(arr);
        int low = 0, high = arr.length-1;
        while(low < high){
            if(arr[high] - arr[low] == diff)
                return true;
            else if(arr[high] - arr[low] > diff)
                low++;
            else
                high--;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{40, 1, 100, 8, 30,};
        FindPairWithGivenDifference f = new FindPairWithGivenDifference();
        System.out.println(f.function(arr, 60));
    }
    
}
