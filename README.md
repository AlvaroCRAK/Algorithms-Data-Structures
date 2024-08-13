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
La notación Big O es una herramienta comúnmente utilizada para determinar el rendimiento o eficiencia de un algoritmo, especialmente en términos de tiempo de ejecución en función del tamaño de la entrada. Expresa el comportamiento asintótico (el peor de los casos) del algoritmo cuando el tamaño de la entrada tiende a infinito.

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
    # Time Complexity: O(n)
    # Space Complexity: o(1)
```

