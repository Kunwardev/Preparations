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
public class MaxMinInArrayTournamentMethod
{
    class MaxMin{
        int max, min;
        public MaxMin(int max, int min){
            this.max = max;
            this.min = min;
        }
    }
    
    private MaxMin function(int[]arr, int start, int end){
        if(start == end){
            return new MaxMin(arr[start], arr[start]);
        }else if(start == end+1){
            return new MaxMin(Math.max(arr[start], arr[end]), Math.min(arr[start], arr[end]));
        }
        else{
            int mid = (start+end)/2;
            MaxMin l = function(arr, start, mid);
            MaxMin r = function(arr, mid+1, end);
            return new MaxMin(Math.max(l.max, r.max), Math.min(l.min, r.min));
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1000, 11, 445, 1, 330, 3000};
        MaxMinInArrayTournamentMethod m = new MaxMinInArrayTournamentMethod();
        MaxMin ans = m.function(arr, 0, arr.length-1);
        System.out.println(ans.max+" "+ans.min);
    }
    
}
