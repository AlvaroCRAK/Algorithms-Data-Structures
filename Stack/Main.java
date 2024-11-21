public class Main {
  public static void main(String[] args) {
    // Crear una instancia de la pila
    Pila<String> pila = new Pila<>();

    // Insertar elementos en la pila usando push
    pila.push("Alvaro");
    pila.push("Enrique");
    pila.push("Cencia");
    pila.push("Perez");

    // Imprimir la pila
    System.out.println("Contenido de la pila:");
    pila.print();  

    // Obtener el valor en la cima sin eliminarlo
    String peekValue = pila.peek();
    System.out.println("\nValor en la cima (peek): " + peekValue);

    // Eliminar el valor en la cima usando pop
    String popValue = pila.pop();
    System.out.println("\nValor eliminado (pop): " + popValue);

    // Imprimir la pila después de eliminar un elemento
    System.out.println("\nContenido de la pila después del pop:");
    pila.print();

    // Verificar el tamaño de la pila
    System.out.println("\nTamaño de la pila: " + pila.size());

    // Eliminar todos los elementos
    pila.pop(); // Elimina "Cencia"
    pila.pop(); // Elimina "Enrique"
    pila.pop(); // Elimina "Alvaro"

    // Verificar si la pila está vacía
    System.out.println("\n¿Está la pila vacía?: " + pila.isEmpty());
  }
}

