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
public class SwapNodesLink
{
    private void function(Node head, int x, int y){
        if(x == y)
            return;
        Node currX = head, prevX = null;
        while(currX != null && currX.data != x){
            prevX = currX;
            currX = currX.next;
        }
        
        Node currY = head, prevY = null;
        while(currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
        }
        
        if(currX == null || currY == null)
            return;
        
        if(prevX != null)
            prevX.next = currY;
        else
            head = currY;
        
        if(prevY != null)
            prevY.next = currX;
        else
            head = currX;
        
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        SwapNodesLink s = new SwapNodesLink();
        s.function(head, 2, 4);
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
}
