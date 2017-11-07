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
public class RearrangePosNegNumber
{
    private void rearrange(int[] arr){
        int i=-1, temp;
        for(int j=0;j<arr.length;j++){
            if(arr[j] < 0){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    
    public static void main(String[] args)
    {
        RearrangePosNegNumber r = new RearrangePosNegNumber();
        int[] arr = new int[]{-12, 11, -13, -5, 6, -7, 5, -3, -6 };
        r.rearrange(arr);
        for(int p: arr)
            System.out.print(p+" ");    
    }
    
}
