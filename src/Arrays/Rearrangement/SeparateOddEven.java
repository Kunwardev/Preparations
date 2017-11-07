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
public class SeparateOddEven
{
    private void function(int[] arr){
        int left = 0, right = arr.length-1;
        while(left < right){
            while(arr[left]%2 == 0 && left<right)
                left++;
            while(arr[right]%2 == 1 && left<right)
                right--;
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{12, 34, 45, 9, 8, 90, 3};
        SeparateOddEven s = new SeparateOddEven();
        s.function(arr);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
