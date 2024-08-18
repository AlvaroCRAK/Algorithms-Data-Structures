# Algorithms & Data Structures

## Time Complexity
La complejidad temporal mide cómo cambia el tiempo de ejecución de un algoritmo a medida que crece el tamaño de la entrada, denotado como `n`.

## Space Complexity
La complejidad espacial mide cómo cambia la cantidad de memoria que un algoritmo necesita para ejecutarse en función de `n`.

## Tiempo de Ejecución
Es el tiempo que un programa tarda en ejecutarse desde que comienza hasta que termina.

## Tiempo de Compilación
Es el tiempo que tarda en convertir el código fuente en un código ejecutable por la máquina.

## Notación Big O
La notación Big O es una herramienta comúnmente utilizada para determinar el rendimiento o eficiencia de un algoritmo, especialmente en términos de tiempo de ejecución en función del tamaño de la entrada. Expresa el comportamiento asintótico (el peor de los casos) del algoritmo cuando el tamaño de la entrada tiende a infinito (una computadora tradicional puede realizar 10^8 operaciones).

### Ejemplo de Código:

```python
n = 1000        # 1 operación básica
counter = 0     # 1 operación básica

for i in range(n):    # 2 operaciones básicas, pero se repite N veces
    counter += 1      # por lo tanto serán en total 2N operaciones
    counter += 1

# f(n) = 2n + 2

# Notación Big O:
# Time Complexity: O(n) 
# - El bucle se ejecuta 'n' veces y cada iteración realiza un número constante de operaciones, por lo que la complejidad temporal es O(n).

# Space Complexity: O(1) 
# - El algoritmo utiliza una cantidad constante de memoria (solo para las variables 'n' y 'counter'), independientemente del tamaño de la entrada 'n', por lo que la complejidad espacial es O(1).
```

```python
n = 1000                # 1 operacion basica
counter = 0             # 1 operacion basica

for i in range(n):      # Se repetira n veces
    for j in range(n):  # Se repetira n veces
        counter += 1    # 1 operacion basica

    # f(n) = n^2 + 2

    # Notacion Big O:
    # Time Complexity: O(n^2)
    # Space Complexity: O(1)
```
```python
n = 50000
numbers = [i+1 for i in range(n)]

counter = 0

for i in range(n):
    x = 2
    x = 1
    if x == 1:
        counter += 1
    if x in numbers:
        counter += 1

print(counter)

# f(n) = n^2 + 5n + 2
# Time complexity: O(n^2)

# f(n) = n + 2
# Space complexity: O(n)
```
# Arrays
Conjunto de elementos (datos).

## Arrays estáticos
Los arrays estáticos tienen un tamaño fijo definido en tiempo de compilación.

```cpp
#include <iostream>
using namespace std;
int main(){
  int a[10]; // O(1) => Declaración
  int b[10] = {0}; // O(n) Inicialización

  cout << b[0] << "\n"; // Indexación: O(1)
  cout << b[5] << "\n";
}
```
La memoria para los arrays estaticos se asignan en la pila(Stack).

## Arrays dinamicos
El tamaño de los arrays dinámicos se puede definir en tiempo de ejecución.
```cpp
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main(){
  vector<int> a(10, 0); // O(n) Inicialización

  a.push_back(1); // O(1) Insertar elemento al final del vector
  a.push_back(2);
  a.push_back(3);

  cout << a[0] << "\n"; // O(1) Indexación
  cout << a.size() << "\n";  // O(1) Obtener tamaño del array
  a[0] = -1; // O(1)

  a.pop_back(); // O(1) Eliminar elemento del final

  a.insert(a.begin() + 2, 5); // O(n) Insertar elemento en una posición
  a.erase(a.begin() + 2); // O(n) Eliminar elemento en una posición

  sort(a.begin(), a.end()); // MergeSort: O(nlogn)

  cout << *a.begin(); // O(1)
}
```
```python
number_list = [0 for i in range(10)] # O(n)

number_list.append(1) # O(1)
number_list.append(2)
number_list.append(3)

print(number_list[0]) # O(1)
print(len(number_list)) # O(1)

number_list.pop() # O(1)

number_list.insert(2, 5) # O(n)
number_list.pop(2) # O(n)

number_list = sorted(number_list)

# Mutabilidad de listas
lista_1 = [1, 2, 3, 4, 5]
lista_2 = lista_1 # .copy() evita que el objeto tenga, por así decirlo, dos nombres. .copy() es O(n)

lista_2[0] = -1
print(lista_1) # Imprimen lo mismo porque hacen referencia a la misma lista única
print(lista_2) # print(id(lista_1))
```
La memoria para los arrays dinámicos se asigna en el heap.

Los arrays estáticos son más rápidos en acceso debido a que están en la pila y tienen menos sobrecarga de memoria. Sin embargo, esta diferencia suele ser insignificante o pequeña en la gran mayoría de los casos.

# Strings
Los strings (cadenas) podemos entenderlas como un vector pero de caracteres. En C++ contamos con std::string, mientras que en Python con str,

Algo muy importante a tener en cuenta es que las cadenas en Python son inmutables. Es decir, no podemos modificar los elementos de esa cadena. Para esto, cada vez que queramos modificar sus elementos, o bien creamos una nueva cadena, o metemos los caracteres de la cadena en una lista para su facil modificacion.
```cpp
#include <iostream>
using namespace std;
int main(){
  string s = "cadena"; // O(n) asignacion

  cout << s[0] << "\n"; // O(1) Indexacion
  s[0] = 'k'; // O(1)
  cout << s.size() << "\n"; // O(1) el tamanho de la cadena
  s.pop_back();  // O(1) eliminacion del ultimo caracter
  
  string s1 = "cadena1", s2 = "cadena2";
  string t = s1 + s2; // O(|s2|)) la complejidad de la concatenacion dependera del tamanho de la derecha

  cout << t << "\n";
}
```
```python
s = "cadena"
print(s)
```
# Hash table
La tabla hash (hash table) es una estructura de datos que relaciona parejas de datos: una llave y un valor (las llaves son unicas). Para poder acceder al valor necesitaremos consultar a la estructura usando la llave. Muchos lenguajes de programacion contienen esta estructura ya implementada.
1. Python => <class 'dict'>
2. C++ => std::unordered_map
3. Java => HashMap o Hashtable
```python
# Creamos una tabla hash vacia
hash_table = {}
print(type(hash_table))

# Agregamos llaves con sus respectivos valores
hash_table['key1'] = 'value1'
hash_table['key2'] = 'value2'
hash_table['key3'] = 'value3'
hash_table['key4'] = 'value4'

# Accedemos a los valores por sus llaves
print(hash_table['key2'])
print(hash_table['key4'])

# Eliminamos una llave de la tabla hash
value = hash_table.pop('key3')
print('key3' in hash_table)
print(value)
```
Las tablas hash tienen por lo general estas tres operaciones que vimos:
1. Agregar una llave
2. Acceder al valor de una llave
3. Eliminar una llave
Estas operaciones tienen un tiempo promedio de ejecucion de O(1).


