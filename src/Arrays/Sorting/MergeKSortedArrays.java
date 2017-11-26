/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Sorting;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 *
 * @author Kunwar
 */
class ArrayContainer implements Comparable<ArrayContainer>{
    int[] arr;
    int index;
    
    public ArrayContainer(int[] num, int index){
        this.arr = num;
        this.index = index;
    }
    
    public int compareTo(ArrayContainer o)
    {
        return (this.arr[this.index] - o.arr[o.index]);
    }
    
}

public class MergeKSortedArrays
{
    private int[] function(int[][] arr){
        int[] result = new int[arr.length*arr[0].length];
        int i = 0;
        PriorityQueue<ArrayContainer> pq = new PriorityQueue<>();
        for(int j=0;j<arr.length;j++){
            pq.add(new ArrayContainer(arr[j], 0));
        }
        ArrayList<Integer> al = new ArrayList<>();
        while(!pq.isEmpty()){
            ArrayContainer ac = pq.poll();
            result[i++]=ac.arr[ac.index];
            if(ac.index < ac.arr.length-1){
            pq.add(new ArrayContainer(ac.arr, ac.index+1));
	}
    }
        System.out.println(al);
        return result;
    }
    
    public static void main(String[] args)
    {
        MergeKSortedArrays m = new MergeKSortedArrays();
        int[][] arr = new int[][]{{1,3,5,7},{2,4,6,8},{0,9,10,11}};
        int[] result = m.function(arr);
        for(int p: result)
            System.out.print(p+" ");
    }
    
}
