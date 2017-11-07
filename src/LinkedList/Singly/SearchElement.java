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
public class SearchElement
{
    private boolean find(Node head, int data){
        while(head != null){
            if(head.data == data)
                return true;
            head = head.next;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        SearchElement s = new SearchElement();
        System.out.println(s.find(head, 5));
    }
    
}
