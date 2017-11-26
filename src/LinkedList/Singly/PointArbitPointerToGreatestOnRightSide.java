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
public class PointArbitPointerToGreatestOnRightSide
{
    static class arbitNode{
        int data;
        arbitNode next, arbit;
        
        public arbitNode(int data){
            this.data = data;
            this.next = null;
            this.arbit = null;
        }
        
    }
    
    private arbitNode reverse(arbitNode head){
        arbitNode current = head, next, prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    private arbitNode function(arbitNode head){
        arbitNode temp = reverse(head);
        arbitNode max = temp;
        arbitNode check = temp.next;
        while(check != null){
            check.arbit = max;
            if(check.data > max.data){
                max = check;
            }
            check = check.next;
        }
        return reverse(temp);
    }
    
    public static void main(String[] args)
    {
        PointArbitPointerToGreatestOnRightSide p = new PointArbitPointerToGreatestOnRightSide();
        arbitNode head = new arbitNode(5);
        head.next = new arbitNode(10);
        head.next.next = new arbitNode(2);
        head.next.next.next = new arbitNode(3);
        head = p.function(head);   
    }
}
