/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Extra;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Kunwar
 */
public class SlidingWindowMaximum
{
    private void function(int[] arr, int k){
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        for(int i=k;i<arr.length;i++){
            System.out.print(arr[dq.peek()]+" ");
            while(!dq.isEmpty() && dq.peek()<=i-k)
                dq.removeFirst();
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        System.out.println(arr[dq.peek()]);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{12, 1, 78, 90, 57, 89, 56};
        int k = 3;
        SlidingWindowMaximum s = new SlidingWindowMaximum();
        s.function(arr, k);
    }
    
}
