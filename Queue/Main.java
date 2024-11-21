public class Main {
  public static void main(String[] args) {
    // Crear una instancia de la cola
    Cola<String> cola = new Cola<>();

    // Insertar elementos en la cola usando offer
    cola.offer("Alvaro");
    cola.offer("Enrique");
    cola.offer("Cencia");
    cola.offer("Perez");

    // Imprimir la cola
    System.out.println("Contenido de la cola:");
    cola.print();  

    // Obtener el primer elemento sin eliminarlo
    String peekValue = cola.peek();
    System.out.println("\nPrimer valor (peek): " + peekValue);

    // Eliminar el primer elemento usando poll
    String pollValue = cola.poll();
    System.out.println("\nValor eliminado (poll): " + pollValue);

    // Imprimir la cola después de eliminar un elemento
    System.out.println("\nContenido de la cola después del poll:");
    cola.print();

    // Verificar el tamaño de la cola
    System.out.println("\nTamaño de la cola: " + cola.size());

    // Eliminar todos los elementos
    cola.poll(); // Elimina "Enrique"
    cola.poll(); // Elimina "Cencia"
    cola.poll(); // Elimina "Perez"

    // Verificar si la cola está vacía
    System.out.println("\n¿Está la cola vacía?: " + cola.isEmpty());
  }
}

