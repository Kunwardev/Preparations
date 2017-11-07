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
public class SortInWaveForm
{
    //a[0] >= a[1] <= a[2] >= a[3]
    private void sort(int[] arr){
        int i=0;
        for(;i<arr.length;i+=2){
            if(i > 0 && arr[i] < arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
            if(i < arr.length-1 && arr[i] < arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[] {10, 90, 49, 2, 1, 5, 23};
        SortInWaveForm s = new SortInWaveForm();
        s.sort(arr);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}

