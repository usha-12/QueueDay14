package Queue.programs;

public class Node<T> {
    T data;
    Node <T> next;
    public Node(T data){
        this.data = data;
        this.next = null;
    }
    public Node(){

    }
    public T getData(){
        return data;
    }
    public void setData(T data){
        this.data = data;
    }
    public  Node<T> getNext(){
        return  next;
    }
    public void setNext(Node<T> next){
        this.next = null;
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