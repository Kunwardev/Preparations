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
public class RecursivePrintReverse
{
    private void functionPrint(Node a){
        if(a != null){
            functionPrint(a.next);
            System.out.print(a.data+" ");
        }
    }
    
    public static void main(String[] args)
    {
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);
        a.next.next.next = new Node(4);
        RecursivePrintReverse r = new RecursivePrintReverse();
        r.functionPrint(a);
    }
    
}
