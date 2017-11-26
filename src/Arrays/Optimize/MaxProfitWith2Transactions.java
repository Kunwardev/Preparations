/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.Optimize;

/**
 *
 * @author Kunwar
 */
public class MaxProfitWith2Transactions
{
    private int function(int[] price){
        int[] profit = new int[price.length];
        int max_price = price[price.length-1];
        for(int i=price.length-2;i>=0;i--){
            if(price[i] > max_price)
                max_price = price[i];
            profit[i] = Math.max(profit[i+1], max_price-price[i]);
        }
        int min_price = price[0];
        for(int i=1;i<price.length;i++){
            if(price[i] < min_price)
                min_price = price[i];
            profit[i] = Math.max(profit[i-1], profit[i]+(price[i]-min_price));
        }
        return profit[price.length-1];
    }
    
    public static void main(String[] args)
    {
        int[] price = new int[]{2, 30, 15, 10, 8, 25, 80};
        MaxProfitWith2Transactions m = new MaxProfitWith2Transactions();
        System.out.println(m.function(price));
    }
    
}
