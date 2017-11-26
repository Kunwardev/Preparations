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
public class RearrangeArray
{
    private void rearrange(int[] arr){
        int val = 0;
        int i = arr[0];
        while(i != 0){
            int new_i = arr[i];
            arr[i] = val;
            val = i;
            i = new_i;
        }
        arr[0] = val;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{2,0,1,4,5,3};
        RearrangeArray r = new RearrangeArray();
        r.rearrange(arr);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
