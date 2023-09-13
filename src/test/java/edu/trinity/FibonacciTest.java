package edu.trinity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacci() {
        Fibonacci pos = new Fibonacci();
        Assertions.assertAll(
                () -> assertEquals(3, pos.fibonacci(4)),
                () -> assertEquals(3, pos.fibonacci(4)),
                () -> assertEquals(55, pos.fibonacci(10)),
                () -> assertEquals(0, pos.fibonacci(0)),
                () -> assertEquals(1, pos.fibonacci(2)),
                () -> assertThrows(IllegalArgumentException.class, () -> pos.fibonacci(-10))
        );

    }
}