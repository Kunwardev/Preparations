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
public class RearrangeInMaxMinForm
{
    private int[] function(int[] arr){
        int start = 0, end = arr.length-1;
        int[] flag = new int[arr.length];
        boolean flags = true;
        for(int i=0;i<arr.length;i++){
            if(flags){
                flag[i] = arr[end--];
            }else{
                flag[i] = arr[start++];
            }
            flags = !flags;
        }
        return flag;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        RearrangeInMaxMinForm r = new RearrangeInMaxMinForm();
        arr = r.function(arr);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
