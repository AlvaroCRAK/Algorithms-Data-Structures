public class LinkedList<T> {
  private static class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
      this.data = data;
    }
  }

  private Node<T> head;
  private int size;

  public LinkedList() {
    this.head = null;
    this.size = 0;
  }
  public void add(T data){
    Node<T> newNode = new Node<>(data);
    if ( head == null )
      head = newNode;
    else {
      Node<T> current = head;
      while ( current.next != null )
        current = current.next;

      current.next = newNode;
    }
    size ++;
  }
  public T remove(int index) {
    if ( index < 0 || index >= size ){
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    if ( index == 0 ) {
      T data = head.data;
      head = head.next;
      size --;
      return data;
    }

    Node<T> current = head;
    for ( int i = 0; i < index - 1; i++ )
      current = current.next;
    T data = current.next.data;
    current.next = current.next.next;
    size --;
    return data;
  }
  public T get(int index){
    if ( index < 0 || index >= size )
      throw new IndexOutOfBoundsException("Index out of bounds");
    Node<T> current = head;
    for ( int i = 0; i < index; i++ )
      current = current.next;

    return current.data;
  }
  public int size() {
    return size;
  }
  public void printList() {
    Node<T> current = head;
    while ( current != null ){
      System.out.print(current.data + " => " );
      current = current.next;
    }
    System.out.println("null");
  }
}

