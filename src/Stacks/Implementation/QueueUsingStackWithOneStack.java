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
public class QueueUsingStackWithOneStack
{
    Stack<Integer> st1;
    
    public QueueUsingStackWithOneStack(){
        st1 = new Stack<>();
    }
    
    private void offer(int x){
        st1.push(x);
    }
    
    private int poll(){
        if(st1.isEmpty())
            return -1;
        else if(st1.size() == 1)
            return st1.pop();
        else{
            int x = st1.pop();
            int res = poll();
            st1.push(x);
            return res;
        }
    }
    
    public static void main(String[] args)
    {
        QueueUsingStackWithOneStack q = new QueueUsingStackWithOneStack();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.poll());
        System.out.println(q.st1);
    }
    
}
