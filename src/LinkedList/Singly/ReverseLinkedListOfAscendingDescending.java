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
public class ReverseLinkedListOfAscendingDescending
{
    static Node head;
    void sort()
    {
        /* Create 2 dummy nodes and initialise as
           heads of linked lists */
        Node Ahead = new Node(0), Dhead = new Node(0);
 
        // Split the list into lists
        splitList(Ahead, Dhead);
 
        Ahead = Ahead.next;
        Dhead = Dhead.next;
 
        // reverse the descending list
        Dhead = reverseList(Dhead);
 
        // merge the 2 linked lists
        head = mergeList(Ahead,Dhead);
    }
 
    /* Function to reverse the linked list */
    Node reverseList(Node Dhead)
    {
        Node current = Dhead;
        Node prev = null;
        Node next;
        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Dhead = prev;
        return Dhead;
    }
 
    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
 
    // A utility function to merge two sorted linked lists
    Node mergeList(Node head1, Node head2)
    {
        // Base cases
        if (head1 == null) return head2;
        if (head2 == null) return head1;
 
        Node temp = null;
        if (head1.data < head2.data)
        {
            temp = head1;
            head1.next = mergeList(head1.next, head2);
        }
        else
        {
            temp = head2;
            head2.next = mergeList(head1, head2.next);
        }
        return temp;
    }
 
    // This function alternatively splits a linked list with head
    // as head into two:
    // For example, 10->20->30->15->40->7 is splitted into 10->30->40
    // and 20->15->7
    // "Ahead" is reference to head of ascending linked list
    // "Dhead" is reference to head of descending linked list
    void splitList(Node Ahead, Node Dhead)
    {
        Node ascn = Ahead;
        Node dscn = Dhead;
        Node curr = head;
 
        // Link alternate nodes
 
        while (curr != null)
        {
            // Link alternate nodes in ascending order
            ascn.next = curr;
            ascn = ascn.next;
            curr = curr.next;
 
            if (curr != null)
            {
                dscn.next = curr;
                dscn = dscn.next;
                curr = curr.next;
            }
        }
 
        ascn.next = null;
        dscn.next = null;
    }
 
    /* Drier program to test above functions */
    public static void main(String args[])
    {
        
        head = new Node(10);
        head.next  = new Node(40);
        head.next.next = new Node(53);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(67);
        head.next.next.next.next.next = new Node(12);
        head.next.next.next.next.next.next = new Node(89);
        ReverseLinkedListOfAscendingDescending r = new ReverseLinkedListOfAscendingDescending();
        System.out.println("Given linked list");
        r.printList();
 
        r.sort();
 
        System.out.println("Sorted linked list");
        r.printList();
    }
 
} 
}
