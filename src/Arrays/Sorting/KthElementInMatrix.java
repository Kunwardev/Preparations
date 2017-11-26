/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Sorting;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author Kunwar
 */
public class KthElementInMatrix
{
    class Number_compare implements Comparator<Number>{

        public int compare(Number o1, Number o2)
        {
            return o1.val - o2.val;
        }
        
    }
    
    class Number{
        public int val;
        public int row;
        public int col;
        
        public Number(int val, int row, int col){
            this.val = val;
            this.row = row;
            this.col = col;
        }
        
    }
    
    private int function(int[][] mat, int k){
        PriorityQueue<Number> pq = new PriorityQueue<>(new Number_compare());
        int count = 0;
        Number a;
        for(int i=0;i<mat.length;i++){
            a = new Number(mat[i][0], i, 0);
            pq.offer(a);
        }
        while(count < k-1){
            a = pq.poll();
            //System.out.println(a.val+" "+a.row+" "+a.col);
            if(a.col != mat[0].length-1)
                pq.offer(new Number(mat[a.row][a.col+1], a.row, a.col+1));
        count++;
        }
        Number x = pq.poll();
        return x.val;
    }
    
    public static void main(String[] args)
    {
        int[][] mat = new int[][]{{10, 20, 30, 40},
                                    {15, 25, 35, 45},
                                    {25, 29, 37, 48},
                                    {32, 33, 39, 50},};
        KthElementInMatrix k = new KthElementInMatrix();
        System.out.println(k.function(mat, 7));
    }
    
}
