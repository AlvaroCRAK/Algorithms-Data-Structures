public class Node<K, V> {
  Node<K, V> next = null;
  K key;
  V value;
  Node ( K key, V value ) {
    this.key = key;
    this.value = value;
  }
}
