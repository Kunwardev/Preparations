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
public class ZigZagFashion
{
    private Node function(Node head){
        boolean flag = true;
        Node current = head;
        
        while(current.next != null){
            if(flag){
                if(current.data > current.next.data){
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            }else{
                if(current.data < current.next.data){
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            }
            current = current.next;
            flag = !flag;
        }
        return head;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        ZigZagFashion z = new ZigZagFashion();
        head = z.function(head);
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
}
