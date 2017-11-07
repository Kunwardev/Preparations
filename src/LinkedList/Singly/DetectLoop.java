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
public class DetectLoop
{
    private boolean function(Node head){
        Node slow = head, fast = head;
        while(fast.next != null && fast != null){
            slow = slow.next; 
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;
        DetectLoop d = new DetectLoop();
        System.out.println(d.function(head));
    }
    
}
