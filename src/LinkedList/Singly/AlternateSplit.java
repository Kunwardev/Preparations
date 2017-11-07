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
public class AlternateSplit
{
    Node aRef, bRef;
    private void alternate(Node src){
        Node aDummy = new Node(0);
        aRef = aDummy;
        Node bDummy = new Node(0);
        bRef = bDummy;
        while(src != null && src.next != null){
            aDummy.next = src;
            aDummy = aDummy.next;
            bDummy.next = src.next;
            bDummy = bDummy.next;
            src = src.next.next;
        }
        aDummy.next = null;
        bDummy.next = null;
    }
    
    public static void main(String[] args)
    {
        AlternateSplit a = new AlternateSplit();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        a.alternate(head);
        while(a.bRef != null){
            System.out.print(a.bRef.data+" ");
            a.bRef = a.bRef.next;
        }
    }
    
}
