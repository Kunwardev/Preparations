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
public class CountNumberOfInt
{
    private int function(Node head, int data){
        int count = 0;
        while(head != null){
            if(head.data != data){
                count++;
            }
            head = head.next;
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        CountNumberOfInt c = new CountNumberOfInt();
        System.out.println(c.function(head, 1));
    }
    
}
