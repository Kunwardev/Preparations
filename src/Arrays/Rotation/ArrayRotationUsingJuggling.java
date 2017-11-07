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
public class ArrayRotationUsingJuggling
{
    private void rotate(int[] arr, int d){
        int i, j, k, temp;
        for(i=0;i<gcd(arr.length,d);i++){
            temp = arr[i];
            j = i;
            while(1 != 0){
                k = j + d;
                if(k >= arr.length)
                    k = k % arr.length; // Instead of subtraction, use modulo to avoid
                                        // indexOutOfBoundExceptions
                if(k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
    
    private int gcd(int n, int d){
        if(d == 0)
            return n;
        return gcd(d, n%d);
    }
    
    public static void main(String[] args)
    {
        ArrayRotationUsingJuggling a = new ArrayRotationUsingJuggling();
        int[] arr = new int[]{1,2,3,4,5,6,7};
        a.rotate(arr, 9);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
