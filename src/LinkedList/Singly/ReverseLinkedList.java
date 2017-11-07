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
public class ReverseLinkedList
{
    
    private Node function(Node head){
        Node prev = null, curr = head, next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        ReverseLinkedList r = new ReverseLinkedList();
        head = r.function(head);
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    
}
