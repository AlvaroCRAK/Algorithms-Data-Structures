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

# f(n) = 2n + 2
