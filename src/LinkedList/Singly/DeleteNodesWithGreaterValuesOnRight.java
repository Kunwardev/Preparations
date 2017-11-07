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
public class DeleteNodesWithGreaterValuesOnRight
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
        head = reverse(head);
        Node maxNode = head;
        Node current = head;
        Node temp;
        while(current != null && current.next != null){
            if(maxNode.data > current.next.data){
                temp = current.next;
                current.next = temp.next;
            }else{
                current = current.next;
                maxNode = current;
            }
        }
        head = reverse(head);
        return head;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(7);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        DeleteNodesWithGreaterValuesOnRight d = new DeleteNodesWithGreaterValuesOnRight();
        head = d.function(head);
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
}
