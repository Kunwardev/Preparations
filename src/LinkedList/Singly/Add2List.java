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
public class Add2List
{
    static class INT{
        int carry;
    }
    
    private int length(Node head){
        Node a = head;
        int count = 0;
        while(a != null){
            a = a.next;
            count++;
        }
        return count;
    }
    
    private Node fill(Node a, int x){
        Node dummy = new Node(0);
        Node a_ = dummy;
        for(int i=0;i<x-1;i++){
            dummy.next = new Node(0);
            dummy = dummy.next;
        }
        dummy.next = a;
        return a_;
    }
    
    private Node function(Node head_1, Node head_2, INT carr){
        if(head_1 != null){
            Node res = new Node(0);
            res.next = function(head_1.next, head_2.next, carr);
            int sum = (head_1.data + head_2.data + carr.carry);
            res.data = sum % 10;
            carr.carry = sum/10;
            return res;
        }
        return null;
    }
    
    public static void main(String[] args)
    {
        Node head_1 = new Node(9);
        head_1.next = new Node(9);
        head_1.next = new Node(9);
        Add2List a = new Add2List();
        Node head_2 = new Node(1);
        head_2.next = new Node(8);
        //head_2.next.next = new Node(4);
        int length_a = a.length(head_1);
        int length_b = a.length(head_2);
        if(length_a > length_b)
            head_2 = a.fill(head_2, length_a - length_b);
        else if(length_a < length_b)
            head_1 = a.fill(head_1, length_b - length_a);
        INT carr = new INT();
        Node res = a.function(head_1, head_2, carr);
        Node check = null;
        while(carr.carry != 0){
            int sum = (res.data+carr.carry);
            check = new Node(sum % 10);
            carr.carry = sum / 10;
            check.next = res;
            res = check;
        }
        while(res != null){
            System.out.print(res.data+" ");
            res = res.next;
        }
    }
    
}
