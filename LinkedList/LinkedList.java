public class LinkedList<V> {
  Node<V> firstNode;
  Node<V> lastNode;
  int size;

  LinkedList () {
    firstNode = null;
    lastNode = null;
    size = 0;
  }
  void add ( V value ) {
    if ( firstNode == null ) {
       firstNode = new Node<>( value );
       lastNode = firstNode;
       size++;
       return;
    }
    Node<V> node = new Node<>( value );
    lastNode.next = node;
    node.prev = lastNode;
    lastNode = node;
    size++;
  }
  void addFirst ( V value ) {
    if ( firstNode == null ) {
      firstNode = new Node<>( value );
      lastNode = firstNode;
      size++;
    }
    Node<V> node = new Node<>( value );
    node.next = firstNode;
    firstNode.prev = node;
    firstNode = node;
    size++;
  }
  int size () {
    return size;
  }
  boolean isEmpty () {
    return firstNode == null;
  }
  V peekFirst () {
    if ( isEmpty() ) 
      return null;
    return firstNode.value;
  }
  V peekLast () {
    if ( isEmpty() ) 
      return null;
    return lastNode.value;
  }
  V removeFirst () {
    if ( isEmpty() ) 
      return null;
    Node<V> node = firstNode;
    firstNode = firstNode.next;
    size--;
    return node.value;
  }
  V removeLast () {
    if ( isEmpty() ) 
      return null;
    Node<V> node = lastNode;
    lastNode = lastNode.prev;
    size--;
    return node.value;
  }
  V get ( int j ) {
    Node<V> node = firstNode;
    Node<V> node2 = lastNode;
    int i = 0;
    int i2 = size - 1;
    while ( node != null ) {
      if ( j == i )
        return node.value;
      if ( j == i2 ) 
        return node2.value;
      i++;
      i2--;
      node = node.next;
      node2 = node2.prev;
    }
    return null;
  }
  V remove ( int j ) {
    if ( isEmpty() )
      return null;
    if ( j < 0 || j >= size ) 
      return null;
    Node<V> node = firstNode;       
    Node<V> node2 = lastNode;
    int i = 0;
    int i2 = size - 1;

    Node<V> node_prev = null;
    Node<V> node2_next = null;

    int temp = 0;
    
    while ( node != null ) {
      if ( j == i ) {
        temp = 1;
        break;
      }
      if ( j == i2 ) {
        temp = 2;
        break;
      }
      i++;
      i2--;

      node_prev = node;
      node = node.next;

      node2_next = node2;
      node2 = node2.prev;
    }

    if ( firstNode == lastNode ) {
      firstNode = null;
      lastNode = null;
      size = 0;
    }

    if ( temp == 1 ) {
      if ( node_prev == null ) {
        firstNode = node.next;
        return node.value;
      }
      node_prev.next = node.next;
      node.next.prev = node_prev;
      return node.value;
    } 
    else if ( temp == 2 ) {
      if ( node2_next == null ) {
        lastNode = node2.prev;
        return node2.value;
      }
      node2_next.prev = node2.prev;
      node2.prev.next = node2_next;
      return node2.value;
    }
    return null;
  }
  void print () {
    Node<V> node = firstNode;
    while ( node != null ) {
      System.out.print ( "<Node1: " + node.value + ">, ");
      node = node.next;
    }
  }
}
