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
public class MergeStack
{
    Node last_1, top_1;
    Node last_2, top_2;
    class Node{
        int data;
        Node next;
        
        public Node(){
            last_2 = null;
            top_2 = null;
        }
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    
    private void push_1(int data){
        Node temp = new Node(data);
        if(last_1 == null){
            top_1 = temp;
            last_1 = top_1;
        }else{
            temp.next = top_1;
            top_1 = temp;
        }
    }
    
    private void push_2(int data){
        Node temp = new Node(data);
        if(last_2 == null){
            top_2 = temp;
            last_2 = top_2;
        }else{
            temp.next = top_2;
            top_2 = temp;
        }
    }
    
    private int pop_1(){
        if(last_1 == null){
            System.out.println("Stack is Empty");
            return -1;
        }else if(last_1 == top_1){
            int x = top_1.data;
            top_1 = top_1.next;
            last_1 = null;
            return x;
        }else{
            int z = top_1.data;
            top_1 = top_1.next;
            return z;
        }
    }
    
    private int pop_2(){
        if(last_2 == null){
            System.out.println("Stack is Empty");
            return -1;
        }else if(last_2 == top_2){
            int x = top_2.data;
            top_2 = top_2.next;
            last_2 = null;
            return x;
        }else{
            int z = top_2.data;
            top_2 = top_2.next;
            return z;
        }
    }
    
    private void merge(){
        last_2.next = top_1;
        top_1 = top_2;
        top_2 = null;
        last_2 = null;
    }
    
    public static void main(String[] args)
    {
        MergeStack m = new MergeStack();
        m.push_1(1);
        m.push_1(2);
        m.push_1(3);
        m.push_2(4);
        m.push_2(5);
        m.push_2(6);
        m.merge();/*
        System.out.println(m.pop_1());
        System.out.println(m.pop_1());
        System.out.println(m.pop_1());
        System.out.println(m.pop_1());
        System.out.println(m.pop_1());
        System.out.println(m.pop_1());
        System.out.println(m.pop_2());*/
    }
    
}
