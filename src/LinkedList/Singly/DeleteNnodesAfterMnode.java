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
public class DeleteNnodesAfterMnode
{
    private Node function(Node head, int m, int n){
        Node temp = head;
        Node destroyer = null;
        int i;
        while(temp != null){
            for(i=1;i<m && temp != null ;i++)
                temp = temp.next;
            if(temp == null)
                break;
            destroyer = temp.next;
            for(i=1;i<n && destroyer != null;i++)
                destroyer = destroyer.next;
            if(destroyer == null)
                temp.next = null;
            else{
                temp.next = destroyer.next;
                temp = temp.next;
            }
        }
        return head;
    }
    
    public static void main(String[] args)
    {
        DeleteNnodesAfterMnode d = new DeleteNnodesAfterMnode();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        Node res = d.function(head, 2, 2);
        while(res != null){
            System.out.print(res.data+" ");
            res = res.next;
        }
    }
    
}
