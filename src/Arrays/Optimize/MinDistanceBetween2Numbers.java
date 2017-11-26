/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Optimize;

/**
 *
 * @author Kunwar
 */
public class MinDistanceBetween2Numbers
{
    private int minDist(int[] arr, int x, int y){
        int prev = 0, min_dist = Integer.MAX_VALUE, i=0;
        for(i = 0; i< arr.length; i++){
            if(arr[i] == x || arr[i] == y){
                prev = i;
                break;
            }
        }
        
        for(;i<arr.length;i++){
            if(arr[i] == x || arr[i] == y){
                if(arr[prev] != arr[i] && min_dist > (i - prev)){
                    min_dist = (i - prev);
                    prev = i;
                }else
                    prev = i;
            }
        }
        return min_dist;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3};
        int x = 3, y = 6;
        MinDistanceBetween2Numbers m = new MinDistanceBetween2Numbers();
        System.out.println(m.minDist(arr, x, y));
    }
    
}
