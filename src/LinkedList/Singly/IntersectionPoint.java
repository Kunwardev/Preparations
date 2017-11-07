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
public class IntersectionPoint
{
    private int count(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    
    private int intersect(Node a, Node b){
        int c1 = count(a);
        int c2 = count(b);
        if(c1 > c2){
            for(int i=0;i<(c1-c2);i++){
                a = a.next;
            }
        }else{
            for(int i=0;i<(c2-c1);i++){
                b = b.next;
            }
        }
        while(a != b){
            a = a.next;
            b = b.next;
        }
        return a.data;
    }
    
    public static void main(String[] args)
    {
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);
        a.next.next.next = new Node(4);
        
        Node b = new Node(2);
        b.next = a.next.next;
        IntersectionPoint i = new IntersectionPoint();
        System.out.println(i.intersect(a, b));
    }
    
}
