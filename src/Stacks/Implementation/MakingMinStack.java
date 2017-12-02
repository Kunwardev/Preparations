/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks.Implementation;

import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class MakingMinStack
{
    int minNumber = Integer.MAX_VALUE;
    Stack<Integer> st;
    
    public MakingMinStack(){
        st = new Stack<>();
    }
    
    private void push(int x){
        
        if(st.isEmpty()){
            minNumber = x;
            st.push(x);
            return;
        }
        
        if(x < minNumber){
            st.push(2*x - minNumber);
            minNumber = x;
        }else{
            st.push(x);
        }
    }
    
    private int pop(){
        int y = st.pop();
        if(y >= minNumber){
            return y;
        }else{
            minNumber = 2*minNumber - y;
            return y;
        }
    }
    
    public static void main(String[] args)
    {
        MakingMinStack m = new MakingMinStack();
        m.push(3);
        m.push(5);
        System.out.println(m.minNumber);
        m.push(1);
        m.push(4);
        System.out.println(m.minNumber);
        m.pop();
        m.pop();
        System.out.println(m.minNumber);
        
    }
    
}
