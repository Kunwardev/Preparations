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
public class RemoveDuplicatesFromSortedList
{
    private Node function(Node head){
        Node temp = head;
        Node next = head.next;
        while(next != null){
            if(head.data != next.data){
                head.next = next;
                head = head.next;
                next = next.next;
            }else{
                next = next.next;
            }
        }
        head.next = next;
        return temp;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(4);
        RemoveDuplicatesFromSortedList r = new RemoveDuplicatesFromSortedList();
        head = r.function(head);
        while(head != null){
            System.out.print( head.data + " ");
            head = head.next;
        }
    }
    
}
