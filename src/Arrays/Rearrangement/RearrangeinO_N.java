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
public class RearrangeinO_N
{
    private void rearrange(int[] arr){
        // Separating using 0 as the pivot
        int i = -1, temp = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j] < 0){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for(int p: arr)
            System.out.print(p+" ");
        System.out.println();
        int pos = i+1, neg = 0;
        while(pos < arr.length && neg < arr.length && arr[neg] < 0){
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            neg += 2;
            pos++;
        }
        
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{-1, 2, -3, 4, 5, 6, -7, 8, 9};
        RearrangeinO_N r = new RearrangeinO_N();
        r.rearrange(arr);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
