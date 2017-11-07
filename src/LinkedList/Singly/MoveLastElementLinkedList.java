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
public class MoveLastElementLinkedList
{
    private Node function(Node head){
        Node temp = head, prev = null;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        temp.next = head;
        head = temp;
        return head;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        MoveLastElementLinkedList m = new MoveLastElementLinkedList();
        head = m.function(head);
        while(head != null){
            System.out.println(head.data+" ");
            head = head.next;
        }
    }
    
}
