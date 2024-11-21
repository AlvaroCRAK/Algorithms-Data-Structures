public class Main {
  public static void main(String[] args) {
    // Crear una instancia de la tabla hash
    HashTable<String, String> hashTable = new HashTable<>();

    // Insertar elementos en la tabla
    hashTable.put("nombre", "Alvaro");
    hashTable.put("apellido", "Cencia");
    hashTable.put("pais", "Perú");

    // Imprimir la tabla hash después de insertar elementos
    System.out.println("Contenido de la tabla hash:");
    hashTable.print();

    // Obtener un valor
    String value = hashTable.get("nombre");
    System.out.println("\nValor para 'nombre': " + value);

    // Actualizar un valor
    hashTable.put("nombre", "Enrique");
    System.out.println("\nTabla después de actualizar 'nombre':");
    hashTable.print();

    // Eliminar un elemento
    String removedValue = hashTable.remove("apellido");
    System.out.println("\nValor eliminado para 'apellido': " + removedValue);
    System.out.println("\nTabla después de eliminar 'apellido':");
    hashTable.print();

    // Intentar obtener un valor eliminado
    String notFound = hashTable.get("apellido");
    System.out.println("\nIntentando obtener 'apellido' después de eliminar: " + notFound);

    // Verificar el tamaño de la tabla
    System.out.println("\nTamaño de la tabla: " + hashTable.size);
  }
}

