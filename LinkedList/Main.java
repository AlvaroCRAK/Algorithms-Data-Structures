public class Main{
  public static void main(String[] args){
    System.out.println("LinkedList: ");
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.printList();

    linkedList.remove(1);
    linkedList.printList();

    System.out.println("Element at index 1: " + linkedList.get(1));
    
    System.out.println("Stack: ");

    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    System.out.println("Stack size: " + stack.size());

    System.out.println("Peek: " + stack.peek());
    System.out.println("Pop: " + stack.pop());
    System.out.println("Stack size after pop: " + stack.size());
    stack.print();
    
    System.out.println("Queue: ");
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    System.out.println("Queue size: " + queue.size());

    System.out.println("Peek: " + queue.peek());
    System.out.println("Dequeue: " + queue.dequeue());
    System.out.println("Queue size after dequeue: " + queue.size());
    queue.print();
  }
}
