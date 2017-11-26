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
public class SortLinkedListWithAbsoluteValues
{
    private Node function(Node head){
        Node  current = head.next, prev = head;
        while(current != null){
            if(current.data < prev.data){
                prev.next = current.next;
                current.next = head;
                head = current;
                current = prev;
            }else
                prev = current;
            current = current.next;
        }
        return head;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(-1);
        head.next = new Node(1);
        head.next.next = new Node(-2);
        head.next.next.next = new Node(4);
        SortLinkedListWithAbsoluteValues s = new SortLinkedListWithAbsoluteValues();
        head = s.function(head);
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
}
