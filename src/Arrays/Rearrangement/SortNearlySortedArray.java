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
public class SortNearlySortedArray
{
    private void function(int[] arr){
        int i,j,key;
        for(i=0;i<arr.length;i++){
            key = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{2, 6, 3, 12, 56, 8};
        SortNearlySortedArray s = new SortNearlySortedArray();
        s.function(arr);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
