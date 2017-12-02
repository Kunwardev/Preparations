/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks.Implementation;

/**
 *
 * @author Kunwar
 */
public class TwoStacksInArray
{
    int[] x;
    int  top_index_1, top_index_2;
    
    public TwoStacksInArray(){
        x = new int[100];
        top_index_1 = -1;
        top_index_2 = 100;
    }
    
    private void push1(int y){
        if(top_index_1 < top_index_2)
            x[++top_index_1] = y;
        else{
            System.out.println("Stack 1 Overflow");
            return;
        }
    }
    
    private void push2(int y){
        if(top_index_1 < top_index_2)
            x[--top_index_2] = y;
        else{
            System.out.println("Stack 2 Overflow");
            return;
        }
    }
    
    private int pop1(){
        if(top_index_1 == -1)
            return -1;
        else
            return x[top_index_1--];
    }
    
    private int pop2(){
        if(top_index_2 == 100)
            return -1;
        else
            return x[top_index_2++];
    }
    
    public static void main(String[] args)
    {
        TwoStacksInArray t = new TwoStacksInArray();
        t.push1(1);
        t.push2(2);
        System.out.println(t.pop2());
        System.out.println(t.pop2());
    }
    
}

