/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks.Implementation;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kunwar
 */
public class StackUsingQueues
{
    Queue<Integer> q1;
    Queue<Integer> q2;
    
    public StackUsingQueues(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    private void push(int x){
        q1.offer(x);
    }
    
    private int pop(){
        if(q1.isEmpty())
            return -1;
        
        while(q1.size() != 1){
            q2.offer(q1.poll());
        }
        int x = q1.poll();
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return x;
    }
    
    public static void main(String[] args)
    {
        StackUsingQueues s = new StackUsingQueues();
        s.push(1);
        s.push(2);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
    
}
