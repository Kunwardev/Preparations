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
public class RotateLinkedList
{
    
    private Node function(Node head, int k){
        Node prev = null;
        Node changer = head;
        Node kth;
        for(int i=0;i<k;i++){
            prev = changer;
            changer = changer.next;
        }
        kth = changer;
        prev.next = null;
        while(changer.next != null)
            changer = changer.next;
        changer.next = head;
        return kth;
    }
    
    public static void main(String[] args)
    {
        RotateLinkedList r = new RotateLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head = r.function(head, 2);
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
}
