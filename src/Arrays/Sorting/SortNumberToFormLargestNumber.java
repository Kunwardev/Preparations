/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Kunwar
 */
public class SortNumberToFormLargestNumber
{
    private void function(String[] arr){
        Arrays.sort(arr, new Comparator<String>() {

            public int compare(String o1, String o2)
            {
                String o1o2 = o1+o2;
                String o2o1 = o2+o1;
                return o1o2.compareTo(o2o1) > 0 ? -1 : 1;
            }
        });
    }
    
    public static void main(String[] args)
    {
        String[] arr = new String[]{"54", "546", "548", "60"};
        SortNumberToFormLargestNumber s = new SortNumberToFormLargestNumber();
        s.function(arr);
        for(String p: arr)
            System.out.print(p+" ");
    }
    
}
