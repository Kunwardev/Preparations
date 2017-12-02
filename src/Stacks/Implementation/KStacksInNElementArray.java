/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks.Implementation;

/**
 *
 * @author Kunwar
 */
public class KStacksInNElementArray
{
    int[] arr, top, next;
    int n, k, free;
    
    public KStacksInNElementArray(int k1, int n1){
        k = k1;
        n = n1;
        arr = new int[n];
        top = new int[k];
        next = new int[n];
        
        for(int i=0;i<k;i++){
            top[i] = -1;
        }
        
        free = 0;
        for(int i=0;i<n-1;i++)
            next[i] = i+1;
        
        next[n-1] = -1;
        
    }
    
    private boolean isFull(){
        return (free == -1);
    }
    
    private boolean isEmpty(int sn){
        return (top[sn] == -1);
    }
    
    private void push(int item, int sn){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        int i = free;
        free = next[i];
        next[i] = top[sn];
        top[sn] = i;
        arr[i] = item;
    }
    
    private int pop(int sn){
        if(isEmpty(sn)){
            System.out.println("Stack Overflow");
            return - 1;
        }
        
        int i = top[sn];
        top[sn] = next[i];
        next[i] = free;
        free = i;
        return arr[i];
        
    }
    
    public static void main(String[] args)
    {
        KStacksInNElementArray k = new KStacksInNElementArray(3, 10);
        k.push(15, 2);k.push(45, 2);
        k.push(17, 1);k.push(49, 1);k.push(39, 1);
        k.push(11, 0);k.push(9, 0);k.push(7, 0);
        
        System.out.println(k.pop(0));
        System.out.println(k.pop(1));
        System.out.println(k.pop(2));
    }
    
}
