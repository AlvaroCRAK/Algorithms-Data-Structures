import java.util.ArrayList;
public class HashTable<K, V> {
  ArrayList<Node<K, V>> mainArray;
  int size;
  int originalSize;

  HashTable () {
    mainArray = new ArrayList<>();
    originalSize = 10;
    size = 0;
    for ( int i = 0; i < originalSize; i++ ) 
      mainArray.add ( null );
  }
  int hashIndex ( K key ) {
    int index = key.hashCode();
    index = index % originalSize;
    return Math.abs ( index );
  }
  V get ( K key ) {
    int index = hashIndex ( key );
    Node<K, V> currentNode = mainArray.get ( index );

    while ( currentNode != null ) {
      if ( key == currentNode.key ) 
        return currentNode.value;
      currentNode = currentNode.next;
    }

    return null;
  }
  void put ( K key, V value ) {
    int index = hashIndex ( key );
    Node<K, V> currentNode = mainArray.get ( index );

    while ( currentNode != null ) {
      if ( currentNode.key == key ) {
        currentNode.value = value;
        return;
      }
      currentNode = currentNode.next;
    }

    currentNode = new Node<>( key, value );
    currentNode.next = mainArray.get ( index );
    mainArray.set ( index, currentNode );

    size++;
    if ( size / originalSize >= 0.7 ) {
      ArrayList<Node<K, V>> newArray = mainArray;
      mainArray = new ArrayList<>();
      originalSize *= 1.5;
      
      for ( int i = 0; i < originalSize; i++ ) 
        mainArray.add ( null );

      for ( int i = 0; i < size; i++ ) {
        Node<K, V> node = newArray.get(i);
        while ( node != null ) {
          put ( node.key, node.value );
          node = node.next;
        }
      }
    }
  }
  V remove ( K key ) {
    int index = hashIndex ( key );
    Node<K, V> currentNode = mainArray.get ( index );
    Node<K, V> prev = null;

    while ( currentNode != null ) {
      if ( currentNode.key == key ) 
        break;
      prev = currentNode;
      currentNode = currentNode.next;
    }

    if ( currentNode == null ) 
      return null;

    size--;
    if ( prev == null ) {
      mainArray.set ( index, null );
      return currentNode.value;
    }

    prev.next = currentNode.next;
    return currentNode.value;
  }
  void print () {
    for ( int i = 0; i < originalSize; i++ ) {
      Node<K, V> node = mainArray.get (i);
      while ( node != null ) {
        System.out.print("<Key: " + node.key + ", Value: " + node.value + ">; ");
        node = node.next;
      }
      System.out.println("null");
    }
  }
}
