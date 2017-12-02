/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks.Implementation;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author Kunwar
 */
class Number{
    int data;
    int count;
    public Number(int data, int count){
        this.data = data;
        this.count = count;
    }
}

class Comparing implements Comparator<Number>{

    @Override
    public int compare(Number o1, Number o2)
    {
        return o2.count - o1.count;
    }
    
}

public class PriorityQueueAsStack
{
    PriorityQueue<Number> pq;
    int count;
    public PriorityQueueAsStack(){
        this.pq = new PriorityQueue<Number>(new Comparing());
        this.count = 0;
    }
    
    private void push(int x){
        Number a = new Number(x, ++count);
        pq.add(a);
    }
    
    private int pop(){
        if(pq.isEmpty())
            return -1;
        return pq.poll().data;
    }
    
    public static void main(String[] args)
    {
        PriorityQueueAsStack p = new PriorityQueueAsStack();
        p.push(1);
        p.push(3);
        p.push(4);
        p.push(2);
        System.out.println(p.pop());
    }
    
}
