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
public class InsertionSort
{
    private Node sortedInsert(int data, Node sorted){
        Node adder = new Node(data);
        if(sorted == null || data <= sorted.data){
            adder.next = sorted;
            sorted = adder;
        }else{
            Node current = sorted;
            while(current != null && current.next.data < adder.data){
                current = current.next;
            }
            adder.next = sorted.next;
            sorted.next = adder;
        }
        return sorted;
    }
    
    private Node insertionSort(Node head){
        Node sorted = null;
        Node current = head;
        while(current != null){
            Node next = current.next;
            sortedInsert(current.data, sorted);
            current = next;
        }
        return sorted;
    }
    
    public static void main(String[] args)
    {
        InsertionSort i = new InsertionSort();
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);
        Node shead = i.insertionSort(head);
        while(shead != null){
            System.out.print(shead.data+" ");
            shead = shead.next;
        }
    }
    
}
