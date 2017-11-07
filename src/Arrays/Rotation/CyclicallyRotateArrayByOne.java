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
public class CyclicallyRotateArrayByOne
{
    private void rotate(int[] arr){
        int temp = arr[arr.length-1];
        int i;
        for(i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    
    public static void main(String[] args)
    {
        CyclicallyRotateArrayByOne c = new CyclicallyRotateArrayByOne();
        int[] arr = new int[]{1,2,3,4,5};
        c.rotate(arr);
        for(int p: arr)
            System.out.print(p + " ");
    }
    
}
