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
public class ArrayRotationUsingBlockSwap
{
    private void swap(int[] arr, int fi, int si, int d){
        int temp;
        for(int i=0;i<d;i++){
            temp = arr[i+fi];
            arr[i+fi] = arr[si+i];
            arr[i+si] = temp;
        }
    }
    
    private void rotate(int[] arr, int d, int n){
        if(d == 0 || n == 0)
            return;
        int i = d; int j = n-d;
        while(i != j){
            if(i < j){
                swap(arr, d-i, d+j-i, i);
                j -= i;
            }else{
                swap(arr, d-i, d, j);
                i -= j;
            }
        }
        swap(arr, d-i, d, i);
    }
    
    public static void main(String[] args)
    {
        ArrayRotationUsingBlockSwap a = new ArrayRotationUsingBlockSwap();
        int[] arr = new int[]{1,2,3,4,5,6,7};
        a.rotate(arr, 2, arr.length);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
