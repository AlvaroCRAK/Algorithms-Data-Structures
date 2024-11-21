public class Main {
    public static void main(String[] args) {

        // Crear una lista doblemente enlazada
        LinkedList<String> list = new LinkedList<>();

        // Agregar elementos al final
        list.add("Alvaro");
        list.add("Enrique");
        list.add("Cencia");
        list.add("Perez");

        list.print();
        System.out.println();

        // Imprimir el tamaño de la lista
        System.out.println("Size: " + list.size()); 

        // Ver el primer y último elemento sin eliminar
        System.out.println("First: " + list.peekFirst());  
        System.out.println("Last: " + list.peekLast());  

        // Eliminar el primer elemento
        System.out.println("Removed first: " + list.removeFirst()); 

        // Eliminar el último elemento
        System.out.println("Removed last: " + list.removeLast());    

        // Ver el tamaño de la lista después de eliminaciones
        System.out.println("Size after removals: " + list.size());  

        // Obtener un elemento en una posición específica 
        System.out.println("Element at index 0: " + list.get(0)); 

        // Eliminar un elemento en el medio de la lista
        System.out.println("Removed element at index 1: " + list.remove(1));  

        // Ver el tamaño final de la lista
        System.out.println("Final Size: " + list.size());  
    }
}

