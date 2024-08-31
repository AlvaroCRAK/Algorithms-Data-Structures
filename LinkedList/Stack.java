import java.util.NoSuchElementException;
public class Stack<T> {
  private LinkedList<T> list = new LinkedList<>();

  public void push(T data){
    list.add(data);
  }
  public T pop() {
    if ( list.size() == 0 )
      throw new NoSuchElementException("Stack is empty");
    return list.remove(list.size() - 1);
  }
  public T peek() {
    if ( list.size() == 0 )
      throw new NoSuchElementException("Stack is empty");
    return list.get(list.size() - 1);
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
