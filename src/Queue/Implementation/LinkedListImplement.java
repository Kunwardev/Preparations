/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue.Implementation;

/**
 *
 * @author Kunwar
 */

class QNode{
    int key;
    QNode next;
    
    public QNode(int key){
        this.key = key;
        this.next = null;
    }    
}

class Queue{
    
}

public class LinkedListImplement
{
    QNode front, rear;
    
    public LinkedListImplement(){
        this.front = this.rear = null;
    }
    
    void enqueu(int key){
        QNode temp = new QNode(key);
        
        if(this.rear == null){
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
    
    QNode deque(){
        if(this.front == null){
            return null;
        }
        QNode temp = this.front;
        this.front = this.front.next;
        
        if(this.front == null){
            this.rear = null;
        }
        return temp;
    }
    
    public static void main(String[] args)
    {
        LinkedListImplement l = new LinkedListImplement();
        l.enqueu(1);
        l.enqueu(2);
        l.enqueu(5);
        System.out.println(l.deque().key);
    }
    
}
