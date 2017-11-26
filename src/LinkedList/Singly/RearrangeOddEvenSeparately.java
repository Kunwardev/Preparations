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
public class RearrangeOddEvenSeparately
{
    private Node rearrange(Node head){
        if(head == null)
            return null;
        Node odd = head;
        Node even = head.next;
        Node even_head = even;
        while(true){
            if(odd == null || even == null || even.next == null){
                odd.next = even_head;
                break;
            }
            odd.next = even.next;
            odd = even.next;
            if(odd.next == null){
                even.next = null;
                odd.next = even_head;
                break;
            }
            even.next = odd.next;
            even = odd.next;
        }
        return head;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        RearrangeOddEvenSeparately r = new RearrangeOddEvenSeparately();
        head = r.rearrange(head);
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
}
