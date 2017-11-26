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
public class FindMaxDiffJIWithArrJGreatArrI
{
    private int function(int[] arr){
        int[] LMin = new int[arr.length];
        int[] RMax = new int[arr.length];
        LMin[0] = arr[0];
        for(int i=1;i<arr.length;i++)
            LMin[i] = Math.min(arr[i], LMin[i-1]);
        
        RMax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
            RMax[i] = Math.max(arr[i], RMax[i+1]);
        int i=0,j=0,maxDiff = -1;
        while(j<arr.length && i < arr.length){
            if(LMin[i] < RMax[j]){
                maxDiff = Math.max(j-i, maxDiff);
                j++;
            }else
                i++;
        }
        return maxDiff;
    }
    
    public static void main(String[] args)
    {
        FindMaxDiffJIWithArrJGreatArrI f = new FindMaxDiffJIWithArrJGreatArrI();
        int[] arr = new int[]{9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        System.out.println(f.function(arr));
    }
    
}
