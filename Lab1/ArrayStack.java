package Lab1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spencer
 */
public class ArrayStack<E> implements Iterable<E> {
    private E[] a;  // holds the items
    private int N;       // number of items in stack

    // create an empty stack with given capacity
    public ArrayStack(int capacity) {
        a =(E[]) new Object[capacity];
        N = 0;
    }

    public boolean isEmpty() {  
        return N == 0;                    
    }
    
    public boolean isFull() {  
        return N == a.length;             
    }
    
    public void push(E item) {
        a[N++] = item;                    
    }
    
    public E pop() {  
        return a[--N];                    
    }
    
    public E peek() {
        return a[N-1];                    
    }
    
    public Iterator<E> iterator() { 
        return new ReverseArrayIterator(); 
    }

    public class ReverseArrayIterator implements Iterator<E> {
        private int i = N-1;

        public boolean hasNext() {
            return i >= 0;
        }

        public E next() { 
            if (!hasNext()) throw new NoSuchElementException();
            return a[i--];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
} 

