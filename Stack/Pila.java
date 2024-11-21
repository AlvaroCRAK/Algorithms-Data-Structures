public class Pila<V> {
  Node<V> lastNode;
  int size;
  Pila () {
    lastNode = null;
    size = 0;
  }
  void push ( V value) {
    if ( lastNode == null ) {
      lastNode = new Node<>(value);
      size++;
      return;
    }
    Node<V> node = new Node<> ( value );
    node.next = lastNode;
    lastNode = node;
    size++;
  }
  V pop () {
    if ( lastNode == null ) 
      return null;
    Node<V> node = lastNode;
    lastNode = lastNode.next;
    size--;
    return node.value;
  }
  boolean isEmpty () {
    return lastNode == null;
  }
  V peek () {
    if ( isEmpty() )
      return null;
    return lastNode.value;
  }
  int size () {
    return size;
  }
  void print () {
    Node<V> node = lastNode;
    while ( node != null ) {
      V val = node.value;
      System.out.print ( "<Node: " + val + ">; ");
      node = node.next;
    }
  }
}
