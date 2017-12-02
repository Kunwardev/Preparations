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
public class QueueUsingStack
{
    Stack<Integer> q1, q2;
    
    public QueueUsingStack(){
        q1 = new Stack<>();
        q2 = new Stack<>();
    }
    
    private void offer(int x){
        q1.push(x);
    }
    
    private int pop(){
        if(q1.isEmpty() && q2.isEmpty())
            return -1;
        if(q2.isEmpty()){
            while(!q1.isEmpty()){
                q2.push(q1.pop());
            }
        }
        return q2.pop();
    }
    
    public static void main(String[] args)
    {
        QueueUsingStack q = new QueueUsingStack();
        q.offer(1);
        q.offer(2);
        System.out.println(q.pop());
    }
    
}
