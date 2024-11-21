public class Cola<V> {
  Node<V> firstNode;
  Node<V> lastNode;
  int size;
  public Cola () {
    firstNode = null;
    lastNode = null;
    size = 0;
  }
  void offer ( V value ) {
    if ( firstNode == null ) {
      firstNode = new Node<>(value);
      lastNode = firstNode;
      size++;
      return;
    }
    Node<V> node = new Node<>(value);
    node.next = lastNode;
    lastNode.prev = node;
    lastNode = node;
    size++;
  }
  V poll () {
    if ( isEmpty() )
      return null;
    Node<V> node = firstNode;
    firstNode = firstNode.prev;
    size--;
    return node.value;
  }
  int size() {
    return size;
  }
  boolean isEmpty() {
    return firstNode == null;
  }
  void print () {
    Node<V> node = firstNode;
    while ( node != null ) {
      System.out.print ( "<Node: " + node.value + ">; ");
      node = node.prev;
    }
  }
  V peek () {
    if ( isEmpty() )
      return null;
    return firstNode.value;
  }
}
