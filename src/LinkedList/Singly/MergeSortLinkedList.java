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
    public Node mergeSort(Node head, int reverse){
        if(head == null || head.next == null){
        //    System.out.print(head.data+" ");
            return head;
        }
        Node right = getMiddle(head);
        Node left = head;
        Node a = mergeSort(right, reverse);
        Node b = mergeSort(left, reverse);
        Node res = merge(a, b, reverse);
        return res;
    }
    
    
    private Node merge(Node left, Node right, int reverse){
        Node dummy = new Node(0);
        Node head = dummy;
        if(reverse == 0){
            while(left != null && right != null){
                if(left.data < right.data){
                    dummy.next = left;
                    left = left.next;
                    dummy = dummy.next;
                }else{
                    dummy.next = right;
                    right = right.next;
                    dummy = dummy.next;
                    }
                }
            }else{
                while(left != null && right != null){
                if(left.data > right.data){
                    dummy.next = left;
                    left = left.next;
                    dummy = dummy.next;
                }else{
                    dummy.next = right;
                    right = right.next;
                    dummy = dummy.next;
                    }
                }
            }
        
        
        if(left != null)
            dummy.next = left;
        if(right != null)
            dummy.next = right;
        return head.next;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(7);
        head.next = new Node(4);
        head.next.next = new Node(9);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(7);
        head.next.next.next.next.next = new Node(8);
        MergeSortLinkedList m = new MergeSortLinkedList();
        head = m.mergeSort(head, 1);
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    private Node getMiddle(Node head)
    {
        Node slow = head, fast = head, prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
    
}
