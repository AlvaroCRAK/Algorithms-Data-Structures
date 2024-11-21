public class Node<V> {
  Node<V> next;
  Node<V> prev;
  V value;
  Node ( V value ) {
    this.value = value;
  }
}
