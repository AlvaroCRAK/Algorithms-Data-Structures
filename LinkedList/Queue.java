import java.util.NoSuchElementException;
public class Queue<T> {
  private LinkedList<T> list = new LinkedList<>();

  public void enqueue(T data){
    list.add(data);
  }
  public T dequeue() {
    if ( list.size() == 0 )
      throw new NoSuchElementException("Queue is empty");
    return list.remove(0);
  }
  public T peek() {
    if ( list.size() == 0 )
      throw new NoSuchElementException("Queue is empty");
    return list.get(0);
  }
  public boolean isEmpty() {
    return list.size() == 0;
  }
  public int size() {
    return list.size();
  }
  public void print(){
    list.printList();
  }
}
