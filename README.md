# Herramientas Utilizadas
Lenguaje de Programación: Java
Versión de Java: 21
Test: Junit 5
Gestor de proyecto: Maven
IDE: Visual Studio Code

# Problema de Suma de Elementos en un Array

## Descripción

Dada la siguiente problemática: ¿puede un número X formarse usando la suma de 2 elementos de un array?

### Ejemplos

**Ejemplo 1**
- **Input:** nums = [1, 4, 3, 9], requiredSum = 8
- **Output:** False

**Ejemplo 2**
- **Input:** nums = [1, 2, 4, 4], requiredSum = 8
- **Output:** True

## Algoritmos

### Algoritmo 1
Resuelve el problema asumiendo que la máquina en donde va a correrse el programa tiene recursos infinitos, que el tiempo de ejecución no importa y que lo más importante es realizar el desarrollo en el menor tiempo posible.

### Algoritmo 2
Resuelve el problema asumiendo que los recursos son un bien preciado, que el tiempo de ejecución sí importa y que el tiempo de desarrollo no es importante.

## Implementación

### Algoritmo 1: `encontrarSuma`

Considerando las condiciones que tengo para realizar el primer algoritmo, opte por hacer 2 bucles anidados ya que creeo razonable porque este ofrece simplicidad y claridad a la hora de enteder el codigo. De esta forma podemos explorar todos los resultados posibles, sin preocuparnos por la eficiencia ya que tenemos recursos infinitos y el tiempo de ejecucion es irrelevante.

Considerando la complejidad temporal en esta solucion es O(n2) ya que ya que el tiempo de ejecucion creace cuadraticamente con el tamaño de 


```java
public boolean encontrarSuma(int[] array, int num) {
    if (array.length == 0) {
        return false;
    }
    for (int i = 0; i <= array.length - 1; i++) {
        for (int j = i + 1; j < array.length; j++) {
            if (array[i] + array[j] == num) {
                return true;
            }
        }
    }
    return false;
}
``` 
### Algoritmo 2: `encuentraSumaEficiente`

En este este escenario teniendo recursos limitados y donde importa el tiempo de ejecucion debemos hacer es el algoritmo lo mas eficiente posible.
Para este algoritmo opte por utilizar un HashSet ya que a demas de no permitir elementos repetidos, el tiempo de busqueda en constante lo que lo hace muy eficiente.
La idea es almacenar los elementos del arreglo en un HashSet y, al iterar sobre el arreglo, verificar si el complemento del número actual está en el HashSet.

En esta slucion en el peor de los casos es O(n) ya que tendriamos que recorrer todo el arreglo, aun asi es mucho mas eficiente que el algoritmo anterior.

```java
public boolean encuentraSumaEficiente(int[] array, int requiredSum) {
    if (array.length == 0) {
        return false;
    }
    Set<Integer> set = new HashSet<>();
    for (int num : array) {
        int complemento = requiredSum - num;
        if (set.contains(complemento)) {
            return true;
        }
        set.add(num);
    }
    return false;
}
```

