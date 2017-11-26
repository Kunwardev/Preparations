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
public class FindMaxDifferenceSuchThatMaxIsAfterMin
{
    private int function(int[] arr){
        int min_element = arr[0];
        int max_diff = arr[1] - arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i] - min_element > max_diff)
                max_diff = arr[i] - min_element;
            if(arr[i] < min_element)
                min_element = arr[i];
        }
        return max_diff;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,6,8,100};
        FindMaxDifferenceSuchThatMaxIsAfterMin f = new FindMaxDifferenceSuchThatMaxIsAfterMin();
        System.out.println(f.function(arr));
    }
    
}
