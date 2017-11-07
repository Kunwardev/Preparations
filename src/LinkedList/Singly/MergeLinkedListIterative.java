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
public class MergeLinkedListIterative
{
    private Node sortedMerge(Node head_1, Node head_2){
        Node head = new Node(0);
        Node temp = head;
        while(head_1 != null && head_2 != null){
            if(head_1.data < head_2.data){
                head.next = head_1;
                head = head.next;
                head_1 = head_1.next;
            }else{
                head.next = head_2;
                head = head.next;
                head_2 = head_2.next;
            }
        }
        if(head_1 != null)
            head.next = head_1;
        else
            head.next = head_2;
        return temp.next;
    }
    
    public static void main(String[] args)
    {
        Node head_1 = new Node(1);
        head_1.next = new Node(3);
        head_1.next.next = new Node(5);
        head_1.next.next.next = new Node(7);
        Node head_2 = new Node(2);
        head_2.next = new Node(4);
        head_2.next.next = new Node(6);
        MergeLinkedListIterative m = new MergeLinkedListIterative();
        Node head = m.sortedMerge(head_1, head_2);
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
}
