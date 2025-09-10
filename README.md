# Ejercicio - Lanzamiento y control de excepciones personalizadas
## Descripción del ejercicio
Se desea que un método de nuestra clase lance un tipo de excepción personalizada, que dicha excepción que pueda
controlarse para que el programa no acabe de forma abrupta ni fuera del control preestablecido.

### Objetivos
* Que el método ``divisionWithCustomException()`` de la clase Exercise de una excepción personalizada: ``DivisionByZeroException``
* Que dicha excepción sea controlada en el método ``main()`` y se evite su propagación.
### Requisitos
* No se pueden modificar en absoluto las clases de test.
### Test

```
  mvn test
```