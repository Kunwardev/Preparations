/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Extra;

/**
 *
 * @author Kunwar
 */
public class MaxSumSuchThatNo2ElementsrAdjacent
{
    private int function(int[] arr){
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        temp[1] = arr[1];
        for(int i=2;i<arr.length;i++){
            temp[i] = Math.max(temp[i-1], temp[i-2]+arr[i]);
        }
        return temp[arr.length-1];
    }
    
    public static void main(String[] args)
    {
        MaxSumSuchThatNo2ElementsrAdjacent m = new MaxSumSuchThatNo2ElementsrAdjacent();
        int[] arr = new int[]{1,20,3};
        System.out.println(m.function(arr));
    }
    
}
