package Queue.programs;

import java.util.Queue;

public class Queues <T extends Comparable<T>>{
    int size;
    LinkedLists<T> list;
    LinkedLists<T> perform = new LinkedLists<T>();
    public Queues(int size){
        this.size = size;
        this.list = new LinkedLists<T>();
    }
    public void enqueue(T newElement){
        if (isFull()){
            System.out.println("Queue Over Flow");
        }
        else {
            list.append(newElement);
            System.out.println("Successfully enqueued element" +newElement+" to the queue");

        }
    }
    public void  dequeue(){
        if (isEmpty()){
            System.out.println("Queue Under Flow:\n No more element to dequeue");

        }
        else {
            System.out.println("Successfully dequeued"+front()+"from the queue");
            list.pop(front());
        }
    }
    public T front(){
        return list.head.data;
    }
    public T rear(){
        return list.tail.data;
    }
    boolean isEmpty(){
        return (size() == 0);
    }
    boolean isFull(){
        return (size() == size);
    }
    public void printQueue(){
        System.out.println("Displaying the queue");
        list.printLinkedList();
    }
    public int size(){
        return (list.getSize());
    }
}
/*Ability to dequeue
from the beginning

-Use LinkedList to do the
Queue Operations*/