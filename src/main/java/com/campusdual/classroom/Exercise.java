package com.campusdual.classroom;

public class Exercise {
    /// Método que realiza una división y lanza una excepción personalizada si el divisor es cero
    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
 /// Verificamos si el divisor es cero
        if (divisor == 0) {
            /// Si es cero, lanzamos una excepción personalizada con un mensaje
            throw new DivisionByZeroException("No se puede dividir por cero");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            /// Llamamos al método que puede lanzar la excepción
            divisionWithCustomException(10, 0);
        } catch (DivisionByZeroException e) {
            /// Capturamos la excepción personalizada aquí para evitar que el programa termine abruptamente
            System.out.println("Excepción controlada: " + e.getMessage());
        }
    }
}



