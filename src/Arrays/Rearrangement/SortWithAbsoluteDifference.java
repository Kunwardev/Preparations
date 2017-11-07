/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Rearrangement;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Kunwar
 */
public class SortWithAbsoluteDifference
{
    private void rearrange(int[] arr, int x){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int p: arr){
            hm.put(p, Math.abs(p-x));
        }
        List list = new LinkedList(hm.entrySet());
        Collections.sort(list, new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                return ((Comparable)((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });
        HashMap sorted = new LinkedHashMap();
        for(Iterator it = list.iterator();it.hasNext();){
            Map.Entry m = (Map.Entry) it.next();
            System.out.print(m.getKey()+" ");
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{10,3,5,9,2}; 
        int x = 7;
        SortWithAbsoluteDifference s = new SortWithAbsoluteDifference();
        s.rearrange(arr, x);
    }
    
}
