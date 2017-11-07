/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Rearrangement;

import java.util.HashMap;

/**
 *
 * @author Kunwar
 */
public class LargestSubArrayWithEqual01
{
    private int function(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0)
                arr[i] = -1;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0, maxLen = 0, endingIndex = -1,start_index = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum == 0){
                maxLen = i+1;
                endingIndex = i;
            }
            if(hm.containsKey(sum)){
                if(maxLen < i - hm.get(sum+arr.length)){
                    maxLen = i - hm.get(sum+arr.length);
                    endingIndex = i;
                }else{
                    hm.put(sum+arr.length, i);
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = (arr[i] == -1)? 0 : 1;
        }
        int end = endingIndex - maxLen + 1;
        System.out.println(end + " to " + endingIndex);
        return maxLen;
    }
    
    public static void main(String[] args)
    {
        LargestSubArrayWithEqual01 l = new LargestSubArrayWithEqual01();
        int[] arr = new int[]{1, 0, 0, 1, 0, 1, 1};
        l.function(arr);
    }
    
}
