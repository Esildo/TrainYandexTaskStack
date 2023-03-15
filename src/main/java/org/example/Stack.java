package org.example;

public class Stack<T>
{
    private int size;
    private class Node
    {
        private T value;
        private Node prev;
    }
    Stack()
    {
        size = 0;
    }
    private Node head;
    public void push(T value)
    {
       Node oldhead = head;
       head = new Node();
       head.value = value;
       head.prev = oldhead;
       size += 1;
    }
    public void pop()
    {
        if(head != null)
        {
            head = head.prev;
            size -=1;
        }
        else
        {
            System.out.println("Stack is empty");
        }
    }
    public T getHead()
    {
        if(head != null)
        {
            return head.value;
        }

        else
        {
            return null;
        }
    }
    public int showSize()
    {
        return size;
    }
}
