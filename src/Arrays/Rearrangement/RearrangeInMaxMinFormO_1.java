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
public class RearrangeInMaxMinFormO_1
{
    private void function(int[] arr){
        int min_index = 0;
        int max_index = arr.length-1;
        int max_element = arr[max_index]+1;
        for(int i=0;i<arr.length;i++){
            if(i % 2 == 0){
                arr[i] += (arr[max_index] % max_element * max_element);
                max_index--;
            }else{
                arr[i] += (arr[min_index] % max_element * max_element);
                min_index++;
            }
        }
        for(int i=0;i<arr.length;i++)
            arr[i] /= max_element;
    }
    
    public static void main(String[] args)
    {
        RearrangeInMaxMinFormO_1 r = new RearrangeInMaxMinFormO_1();
        int[] arr = new int[]{1,2,3,4,5,6,7};
        r.function(arr);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
