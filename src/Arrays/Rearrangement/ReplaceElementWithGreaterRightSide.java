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
public class ReplaceElementWithGreaterRightSide
{
    private void function(int[] arr){
        int length = arr.length;
        int max = arr[length-1];
        arr[length-1] = -1;
        for(int i=length-2;i>=0;i--){
            int res = max;
            if(arr[i] > max){
                max = arr[i];
            }
            arr[i] = res;
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        ReplaceElementWithGreaterRightSide r = new ReplaceElementWithGreaterRightSide();
        r.function(arr);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
