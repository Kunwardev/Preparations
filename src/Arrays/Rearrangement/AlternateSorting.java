/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Rearrangement;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class AlternateSorting
{
    private void sort(int[] arr){
        Arrays.sort(arr);
        int start = 0, end = arr.length-1;
        int max_element = arr[end] + 1;
        for(int i=0;i<arr.length;i++){
            if(i % 2 == 0){
                arr[i] += (arr[end--] % max_element) * max_element;
            }else{
                arr[i] += (arr[start++] % max_element) * max_element;
            }
        }
        for(int i=0;i<arr.length;i++)
            arr[i] /= max_element;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{7,4,5,3,2,6,1};
        AlternateSorting a = new AlternateSorting();
        a.sort(arr);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
