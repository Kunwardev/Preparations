/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue.Implementation;

import java.util.HashMap;

/**
 *
 * @author Kunwar
 */
class DQNode{
    int key, data;
    DQNode pre, next;
    
    public DQNode(int key, int data){
        this.key = key;
        this.data= data;
    }
    
}

public class LRUCache
{
    int capacity;
    HashMap<Integer, DQNode> hm = new HashMap<Integer, DQNode>();
    DQNode head = null;
    DQNode end = null;
    
    public LRUCache(int capacity){
        this.capacity = capacity;
    }
    
    public int get(int key){
        if(hm.containsKey(key)){
            DQNode n = hm.get(key);
            remove(n);
            setHead(n);
            return n.data;
        }
        return -1;
    }
    
    public void remove(DQNode n){
        if(n.pre != null){
            n.pre.next = n.next;
        }else
            head = n.next;
        if(n.next != null)
            n.next.pre = n.pre;
        else
            end = n.pre;
    }
    
    public void setHead(DQNode n){
        n.next = head;
        n.pre = null;
        
        if(head != null){
            head.pre = n;
        }
        head = n;
        if(end == null)
            end = head;
    }
    
    public void set(int key, int value){
        if(hm.containsKey(key)){
            DQNode old = hm.get(key);
            old.data = value;
            remove(old);
            setHead(old);
        }else{
            DQNode created = new DQNode(key, value);
            if(hm.size()>=capacity){
                hm.remove(end.key);
                remove(end);
                setHead(created);
            }else{
                setHead(created);
            }
            hm.put(key,created);
        }
    }
    
    public static void main(String[] args)
    {
        LRUCache l = new LRUCache(3);
        l.set(1, 2);
        l.set(2, 3);
        l.set(3, 4);
        System.out.println(l.hm);
    }
    
}
