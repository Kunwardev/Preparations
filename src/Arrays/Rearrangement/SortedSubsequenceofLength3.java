/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Rearrangement;

/**
 *
 * @author Kunwar
 */
public class SortedSubsequenceofLength3
{
    private void function(int[] arr){
        int length = arr.length;
        int max = length-1, min = 0, i;
        int[] smaller = new int[length];
        smaller[0] = -1;
        for(i=1;i<length;i++){
            if(arr[i] >= arr[i-1]){
                smaller[i] = min;
            }else{
                min = i;
                smaller[i] = -1;
            }
        }
        int[] greater = new int[length];
        greater[arr.length-1] = -1;
        for(i=length-2;i>=0;i--){
            if(arr[i] >= arr[i+1])
                greater[i] = arr.length-1;
            else{
                max = i;
                greater[i] = -1;
            }
        }
        
        for(i=0;i<arr.length;i++){
            if(smaller[i]!=-1 && greater[i]!=-1){
                System.out.println(arr[smaller[i]]+" "+arr[i]+" "+arr[greater[i]]);
                return;
            }
        }
        System.out.println("No result found");
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{12, 11, 10, 5, 6, 2, 30};
        SortedSubsequenceofLength3 s = new SortedSubsequenceofLength3();
        s.function(arr);
    }
    
}
