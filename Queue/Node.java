public class Node<V> {
  Node<V> next = null;
  Node<V> prev = null;
  V value;
  Node ( V value ) {
    this.value = value;
  }
}
