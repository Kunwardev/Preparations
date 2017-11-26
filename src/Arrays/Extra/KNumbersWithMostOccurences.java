/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Extra;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *
 * @author Kunwar
 */
public class KNumbersWithMostOccurences
{
    class Numbers{
    int num, occ;
    public Numbers(int num, int occ){
        this.num = num;
        this.occ = occ;
    }
}
    
   class Compare implements Comparator<Numbers>{

    @Override
    public int compare(Numbers o1, Numbers o2)
    {
        if(o1.occ == o2.occ)
            return o2.num - o1.num;
        return o2.occ - o1.occ;
    }
    
}
 
    
    private void function(int[] arr, int k){
        PriorityQueue<Numbers> pq = new PriorityQueue<>(new Compare());
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i], 1);
            else
                hm.put(arr[i], hm.get(arr[i])+1);
        }
        for(Entry<Integer, Integer> e: hm.entrySet()){
            Numbers a = new Numbers(e.getKey(), e.getValue());
            pq.offer(a);
        }
        while(k != 0){
            Numbers b = pq.poll();
            System.out.println(b.num +" with the occurences of "+b.occ);
            k--;
        }
    }
    
    public static void main(String[] args)
    {
        KNumbersWithMostOccurences k = new KNumbersWithMostOccurences();
        int[] arr = new int[]{7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        k.function(arr, 4);
    }
    
}
