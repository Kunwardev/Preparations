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
public class ReplaceEverElementWithProductOfNextPrev
{
    private void modify(int[] arr){
        int prev = arr[0];
        arr[0] = prev * arr[1];
        for(int i=1;i<arr.length-1;i++){
            int curr = arr[i];
            arr[i] = prev * arr[i+1];
            prev = curr;
        }
        arr[arr.length-1] = prev * arr[arr.length-1];
    }
    
    public static void main(String[] args)
    {
        ReplaceEverElementWithProductOfNextPrev r = new ReplaceEverElementWithProductOfNextPrev();
        int[] arr = new int[]{2, 3, 4, 5, 6};
        r.modify(arr);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
