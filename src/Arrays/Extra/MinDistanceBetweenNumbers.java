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
public class MinDistanceBetweenNumbers
{
    private int function(int[] arr, int x, int y){
        int i = 0, prev = 0, min_dist = Integer.MAX_VALUE;
        for(; i<arr.length; i++){
            if(arr[i] == x || arr[i] == y){
                prev = i;
                break;
            }
        }
        
        for(; i<arr.length; i++){
            if(arr[i] == x || arr[i] == y){
                if(arr[i] != arr[prev] && (prev - i) < min_dist){
                    min_dist = prev;
                }
            }
        }
        return min_dist;
    }
}
