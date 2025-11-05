package com.campusdual.classroom;

/// Esta clase define una excepción personalizada
public class DivisionByZeroException extends Exception {
    ///Constructor que recibe un mensaje y lo pasa a la clase base Exception
    public DivisionByZeroException(String message) {
        super(message);
    }
}
