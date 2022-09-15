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
/*Ability to create a Queue of
56->30->70
- Use LinkedList to do the Queue
Operations
- Here enqueu will internally call append
method on LinkedList.
- So 56 will be added first then 30 and
then 70 to make 56 on top of the Stack*/