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
public class DeleteLastOccurenceOfLinkedList
{
    private Node function(Node head, int data){
        CheckPalindrome c = new CheckPalindrome();
        head = c.reverse(head);
        Node temp = head;
        if(head.data == data){
            return c.reverse(head.next);
        }
        while(temp != null){
            if(temp.data == data){
                temp.data = temp.next.data;
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return c.reverse(head);
    }
    
    public static void main(String[] args)
    {
        DeleteLastOccurenceOfLinkedList d = new DeleteLastOccurenceOfLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(10);
        head = d.function(head, 2);
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
}
