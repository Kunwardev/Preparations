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
public class AddLinkedList
{
    private Node add(Node a, Node b){
        Node res = null;
        Node prev = null;
        Node temp = null;
        int sum = 0, carry = 0;
        while(a != null || b != null){
            sum = carry + (a != null ? a.data : 0) + (b != null ? b.data : 0);
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            temp = new Node(sum);
            if(res == null){
                res = temp;
            }else{
                prev.next = temp;
            }
            prev = temp;
            
            if(a != null)
                a = a.next;
            if(b != null)
                b = b.next;
        }
        if(carry > 0)
            temp.next = new Node(1);
        return res;
    }
    
    public static void main(String[] args)
    {
        Node f = new Node(1);
        Node s = new Node(9);
        s.next = new Node(9);
        AddLinkedList a = new AddLinkedList();
        f = a.add(f, s);
        while(f != null){
            System.out.print(f.data+" ");
            f = f.next;
        }
    }
    
}
