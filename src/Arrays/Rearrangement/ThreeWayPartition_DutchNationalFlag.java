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
public class ThreeWayPartition_DutchNationalFlag
{
    private void dutchNationalFlag(int[] arr, int lowrange, int highrange){
        int start = 0, end = arr.length-1;
        int i=0;
        for(;i<=end;){
            if(arr[i] < lowrange){
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;i++;
            }else if(arr[i] > highrange){
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            }
            else
                i++;
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        ThreeWayPartition_DutchNationalFlag t = new ThreeWayPartition_DutchNationalFlag();
        t.dutchNationalFlag(arr, 10, 20);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
