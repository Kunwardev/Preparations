/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList.Singly;

/**
 *
 * @author Kunwar
 */
public class NthNodeFromEnd
{
    private int function(Node head, int n){
        Node drift = head;
        Node start = head;
        for(int i=0;i<n;i++)
            drift = drift.next;
        while(drift != null){
            head = head.next;
            drift = drift.next;
        }
        return head.data;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        NthNodeFromEnd n = new NthNodeFromEnd();
        System.out.println(n.function(head, 4));
    }
    
}
