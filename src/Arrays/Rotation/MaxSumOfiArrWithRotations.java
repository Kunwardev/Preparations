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
public class MaxSumOfiArrWithRotations
{
    private int function(int[] arr){
        int sum = 0, currVal = 0, i = 0;
        for(int p: arr){
            sum += p;
            currVal += (i++*p);
        }
        int maxVal = currVal;
        for(int j=1;j<arr.length;j++){
            currVal += sum - arr.length*(arr[arr.length-j]);
            if(maxVal < currVal)
                maxVal = currVal;
        }
        return maxVal;
    }
    
    public static void main(String[] args)
    {
        MaxSumOfiArrWithRotations m = new MaxSumOfiArrWithRotations();
        int arr[] = new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(m.function(arr));
    }
    
}
