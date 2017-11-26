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
class RandomList{
    int data;
    RandomList next, random;
    
    public RandomList(int data){
        this.data = data;
        this.next = null;
        this.random = null;
    }
    
}

public class CloneRandomLinkedListinO1
{
    private RandomList clone(RandomList head){
        RandomList curr = head, temp;
        while(curr != null){
            temp = curr.next;
            curr.next = new RandomList(curr.data);
            curr.next.next = temp;
            curr = temp;
        }
        curr = head;
        while(curr != null){
            curr.next.random = curr.random.next;
            curr = (curr.next != null) ? curr.next.next : curr.next;
        }
        
            RandomList original = head, copy = head.next;
            temp = copy;
        
        while(original != null && copy != null){
            original.next = (original.next != null) ? original.next.next : original.next;
            copy.next = (copy.next != null) ? copy.next.next : copy.next;
            original = original.next;
            copy = copy.next;
            
        }
        return temp;
    }

    public static void main(String[] args)
    {
        RandomList r = new RandomList(1);
        r.next = new RandomList(2);
        r.next.next = new RandomList(3);
        r.random = r.next.next;
        r.next.random = r;
        r.next.next.random = r.next;
        CloneRandomLinkedListinO1 c = new CloneRandomLinkedListinO1();
        RandomList cp = c.clone(r);
        while(cp != null){
            System.out.println("OR -> "+r.data+" "+r.random.data);
            System.out.println(cp.data + " "+ cp.random.data);
            cp = cp.next;
            r = r.next;
        }
    }

}
