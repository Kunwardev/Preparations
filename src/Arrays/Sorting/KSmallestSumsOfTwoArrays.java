/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Sorting;

/**
 *
 * @author Kunwar
 */
public class KSmallestSumsOfTwoArrays
{
    private void function(int[] arr1, int[] arr2, int k){
        if(k > arr1.length * arr2.length){
            System.out.println("K pairs does not exist");
            return;
        }
        
        int[] index2 = new int[arr1.length];
        while(k > 0){
            int min_sum = Integer.MAX_VALUE;
            int min_index = 0;
            for(int i1=0;i1<arr1.length;i1++){
                if(index2[i1] < arr2.length && arr1[i1]+arr2[index2[i1]] < min_sum){
                    min_index = i1;
                    min_sum = arr1[i1]+arr2[index2[i1]];
                }
            }
            
            System.out.println("[ "+arr1[min_index]+" "+arr2[index2[min_index]]+" ]");
            index2[min_index]++;
            k--;
        }
    }
    
    public static void main(String[] args)
    {
        KSmallestSumsOfTwoArrays k = new KSmallestSumsOfTwoArrays();
        int[] arr1 = new int[]{1,3,11};
        int[] arr2 = new int[]{2,4,8};
        k.function(arr1, arr2, 4);
    }
    
}
