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
public class DeleteAlternateNode
{
    private void function(Node head){
        if(head == null)
            return;
        Node next = head.next;
        if(next == null)
            return;
        head.next = next.next;
        function(head.next);
    }
    
    public static void main(String[] args)
    {
        DeleteAlternateNode d = new DeleteAlternateNode();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        d.function(head);
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
}
