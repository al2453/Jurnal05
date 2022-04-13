package Soal2.jurnal05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueB <A> {
    private final Queue<A> queueList;
    public QueueB() {
        queueList = new LinkedList<A>();
    }
    public void enqueue(A object) {
        queueList.add(object);
    }
    public A dequeue() throws NoSuchElementException {
        return queueList.remove();
    }
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
    public void printQueue() {
        Iterator<A> iterator = queueList.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println(value + " ");
        }
    }
}