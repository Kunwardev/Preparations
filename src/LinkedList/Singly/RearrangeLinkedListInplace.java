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
// Linked List given as L1->L2->...->Ln
// To be converted to Ln->Ln-1->...->L1

public class RearrangeLinkedListInplace
{
    private Node reverse(Node head){
        Node current = head, prev = null, next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    private Node function(Node head){
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node head_1 = head;
        Node head_2 = slow.next;
        slow.next = null;
        head_2 = reverse(head_2);
        Node result = new Node(0);
        Node dummy = result;
        while(head_1 != null || head_2 != null){
            if(head_1 != null){
                result.next = head_1;
                result = result.next;
                head_1 = head_1.next;
            }
            if(head_2 != null){
                result.next = head_2;
                result = result.next;
                head_2 = head_2.next;
            }
        }
        return dummy.next;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        RearrangeLinkedListInplace r = new RearrangeLinkedListInplace();
        Node result = r.function(head);
        while(result != null){
            System.out.print(result.data+" ");
            result = result.next;
        }
    }
    
}
