package com.example.arrayqueue;

public class ArrayQueue implements Queue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue() {
        int initialCapacity = 10;
        queueArray = new int[initialCapacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public void enqueue(int e) {
        if (isFull()) {
            // Double the capacity and copy elements to a larger array.
            int newCapacity = queueArray.length * 2;
            int[] newQueueArray = new int[newCapacity];

            for (int i = 0; i < size; i++) {
                int index = (front + i) % queueArray.length;
                newQueueArray[i] = queueArray[index];
            }

            front = 0;
            rear = size - 1;
            queueArray = newQueueArray;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % queueArray.length;
        queueArray[rear] = e;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        } else {
            int e = queueArray[front];
            front = (front + 1) % queueArray.length;
            size--;

            if (size == 0) {
                front = -1;
                rear = -1;
            }

            return e;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return queueArray[front];
        }
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("(");
        int current = front;

        for (int i = 0; i < size; i++) {
            result.append(queueArray[current]);
            current = (current + 1) % queueArray.length;
            if (i < size -1){
                result.append(", ");
            }
        }
        result.append(")");
        return result.toString();
    }

    private boolean isFull() {
        return size == queueArray.length;
    }
}
