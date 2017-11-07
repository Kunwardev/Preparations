/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Rotation;

/**
 *
 * @author Kunwar
 */
public class QuicklyFindMultipleRotations
{
    private int[] function(int[] arr){
        int [] temp = new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            temp[i] = temp[i+arr.length] = arr[i];
        }
        return temp;
    }
    
    public static void main(String[] args)
    {
        int[] k = new int[]{1,3,4,6};
        int[] arr = new int[]{1,2,3,4,5};
        QuicklyFindMultipleRotations q = new QuicklyFindMultipleRotations();
        int[] temp = q.function(arr);
        for(int i=0;i<k.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(temp[(k[i])%arr.length+j]+" ");
            }
            System.out.println();
        }
    }
    
}
