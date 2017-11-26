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
public class CheckPalindrome
{
    private boolean function(Node head){
        Node slow = head, fast = head, prev = null;
        Node temp = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid_node = slow;
        prev.next = null;
        mid_node = reverse(slow);
        while(mid_node != null && temp != null){
            if(mid_node.data != temp.data)
                return false;
            mid_node = mid_node.next;
            temp = temp.next;
        }
        return true;
    }
    
    public Node reverse(Node head){
        Node current = head, next, prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    private void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        //head.next.next.next = new Node(1);
        CheckPalindrome c = new CheckPalindrome();
        System.out.println(c.function(head));
    }
    
}
