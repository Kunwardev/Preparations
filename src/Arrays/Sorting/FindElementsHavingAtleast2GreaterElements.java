/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Sorting;

/**
 *
 * @author Kunwar
 */
public class FindElementsHavingAtleast2GreaterElements
{
    private void function(int[] arr){
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > first)
                first = arr[i];
            else if(arr[i] > second)
                second = arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] < second)
                System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args)
    {
        FindElementsHavingAtleast2GreaterElements f = new FindElementsHavingAtleast2GreaterElements();
        int[] arr = new int[]{2,-6,-1,3,2,5,4};
        f.function(arr);
    }
    
    
}
