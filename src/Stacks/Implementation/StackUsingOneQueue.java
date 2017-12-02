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
public class StackUsingOneQueue
{
    Queue<Integer> q;
    
    public StackUsingOneQueue(){
        q = new LinkedList<>();
    }
    
    private void push(int x){
        int size = q.size();
        q.offer(x);
        for(int i=0;i<size;i++){
            int y = q.poll();
            q.offer(y);
        }
    }
    
    private int pop(){
        if(q.isEmpty()){
            System.out.println("No Elements");
            return -1;
        }
        return q.poll();
    }
    
    public static void main(String[] args)
    {
        StackUsingOneQueue s = new StackUsingOneQueue();
        s.push(1);
        s.push(2);
        System.out.println(s.pop());
    }
    
}
