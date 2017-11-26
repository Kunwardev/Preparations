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
public class MinNumberOfJumpsToReachEnd
{
    private int function(int[] arr){
        int length = arr.length;
        if(length == 0 || arr[0] == 0)
            return -1;
        int[] jumps = new int[arr.length];
        for(int i=1;i<length;i++){
            jumps[i] = Integer.MAX_VALUE;
            for(int j=0;j<i;j++){
                if(i <= j+arr[j] && jumps[j] != Integer.MAX_VALUE){
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    break;
                }
            }
        }
        return jumps[length-1];
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,3,6,1,0,9};
        MinNumberOfJumpsToReachEnd m = new MinNumberOfJumpsToReachEnd();
        System.out.println(m.function(arr));
    }
    
}
