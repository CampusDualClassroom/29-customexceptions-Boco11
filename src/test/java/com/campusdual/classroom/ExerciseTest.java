package com.campusdual.classroom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExerciseTest {
    @Test
    @DisplayName("Test if divisionWithCustomException method throws a custom exception")
    void testThrowCustomException() {
        assertThrows(DivisionByZeroException.class ,() -> Exercise.divisionWithCustomException(3,0), "Exception not throwed");
    }

    @Test
    @DisplayName("Test if main method does not throws any exception")
    void testDoesNotLaunchAnyException() {
        assertDoesNotThrow(() -> Exercise.main(null), "Exception throwed");
    }
}