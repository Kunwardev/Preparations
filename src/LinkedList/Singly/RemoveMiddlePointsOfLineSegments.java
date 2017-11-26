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
public class RemoveMiddlePointsOfLineSegments
{
    static class LineSegNode{
        int x, y;
        LineSegNode next;
        public LineSegNode(int x, int y){
            this.x = x;
            this.y = y;
            this.next = null;
        } 
    }
    
    private LineSegNode deleteMiddle(LineSegNode head){
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        LineSegNode next = head.next;
        LineSegNode next_next = next.next;
        if(head.x == next.x){
            while(next_next != null && next.x == next_next.x){
                head.next = next.next;
                next.next = null;
                next = next_next;
                next_next = next_next.next;
            }
        }else if(head.y == next.y){
            while(next_next != null && next.y == next_next.y){
                head.next = next.next;
                next.next = null;
                next = next_next;
                next_next = next_next.next;
            }
        }else
            return null;
        LineSegNode temp = head;
        head = head.next;
        head = deleteMiddle(head);
        head = temp;
        return head;
    }
    
    public static void main(String[] args)
    {
        RemoveMiddlePointsOfLineSegments r = new RemoveMiddlePointsOfLineSegments();
        LineSegNode l = new LineSegNode(0, 10);
        l.next = new LineSegNode(1, 10);
        l.next.next = new LineSegNode(3, 10);
        l.next.next.next = new LineSegNode(10, 10);
        l.next.next.next.next = new LineSegNode(10, 8);
        l.next.next.next.next.next = new LineSegNode(10, 5);
        l.next.next.next.next.next.next = new LineSegNode(20, 5);
        l.next.next.next.next.next.next.next = new LineSegNode(40, 5);
        LineSegNode head = r.deleteMiddle(l);
        while(head != null){
            System.out.print("( "+head.x+" "+head.y+" ), ");
            head = head.next;
        }
    }
    
}
