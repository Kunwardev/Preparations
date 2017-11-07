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
public class Separate01
{
    private void function(int[] arr){
        int i = -1;
        int j, temp;
        for(j=0;j<arr.length;j++){
            if(arr[j] <= 0){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{0,1,0,1,1,0,0,1,0};
        Separate01 s = new Separate01();
        s.function(arr);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
