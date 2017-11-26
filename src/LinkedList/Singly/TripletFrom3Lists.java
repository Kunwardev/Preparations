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
public class TripletFrom3Lists
{
    private boolean function(Node a, Node b, Node c, int sum){
        MergeSortLinkedList m = new MergeSortLinkedList();
        Node b_s = m.mergeSort(b, 0);
        Node c_r = m.mergeSort(c, 1);
        while(a != null){
            Node b_d = b_s;
            Node c_d = c_r;
            while(b_d != null && c_d != null){
                int sum_ = a.data + b_d.data + c_d.data;
                //System.out.println("sdf "+sum_+" "+a.data +" " + b_d.data + " "  + c_d.data);
                if(sum_ == sum){
                    System.out.println(a.data +" " + b_d.data + " "  + c_d.data);
                    return true;
                }else if(sum_ > sum){
                    c_d = c_d.next;
                }else
                    b_d = b_d.next;
            }
            a = a.next;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        TripletFrom3Lists t = new TripletFrom3Lists();
        Node head_a = new Node(20);
        head_a.next = new Node(5);
        head_a.next.next = new Node(15);
        head_a.next.next.next = new Node(100);
        
        Node head_b = new Node(9);
        head_b.next = new Node(10);
        head_b.next.next = new Node(2);
        head_b.next.next.next = new Node(4);
        
        Node head_c = new Node(4);
        head_c.next = new Node(8);
        head_c.next.next = new Node(1);
        head_c.next.next.next = new Node(2);
        
        System.out.println(t.function(head_a, head_b, head_c, 25));
    }
    
}
