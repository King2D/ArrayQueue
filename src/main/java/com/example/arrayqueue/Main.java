package com.example.arrayqueue;

public class Main {
    public static void main(String[] args) {
        Queue q = new ArrayQueue();
        q.enqueue(5);
        q.enqueue(3);
        System.out.println(q.size());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
        System.out.println(q.dequeue());
        q.enqueue(7);
        q.enqueue(9);
        System.out.println(q.peek());
        q.enqueue(4);
        System.out.println(q.size());
        System.out.println(q.dequeue());
        q.enqueue(6);
        q.enqueue(8);
        System.out.println(q.dequeue());
        System.out.println(q);
    }
}