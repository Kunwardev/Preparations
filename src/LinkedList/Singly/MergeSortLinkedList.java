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
public class MergeSortLinkedList
{
    private Node getMiddle(Node head){
        if(head == null)
            return head;
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    private Node mergeSort(Node head){
        if(head == null || head.next == null)
            return head;
        Node middle = getMiddle(head);
        Node next_middle = middle.next;
        middle.next = null;
        
        Node left = mergeSort(head);
        Node right = mergeSort(next_middle);
        System.out.println(left.data+" "+right.data);
        Node result = sortedMerge(left, right);
        return result;
    }

    private Node sortedMerge(Node left, Node right)
    {
        Node result = null;
        if(left == null)
            return right;
        if(right == null)
            return left;
        
        if(left.data <= right.data){
            result = left;
            result.next = sortedMerge(left.next, right);
        }else{
            result = right;
            result.next = sortedMerge(left, right.next);
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        MergeSortLinkedList m = new MergeSortLinkedList();
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        
    }
    
}
