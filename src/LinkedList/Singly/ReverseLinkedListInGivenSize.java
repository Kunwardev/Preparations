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
public class ReverseLinkedListInGivenSize
{
    private Node reverse(Node head, int k){
        Node prev = null, current = head, next = null; 
        int count = 0;
        while(current != null && count < k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if(next != null){
            head.next = reverse(next, k);
        }
        return prev;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        ReverseLinkedListInGivenSize r = new ReverseLinkedListInGivenSize();
        head = r.reverse(head, 2);
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
}
