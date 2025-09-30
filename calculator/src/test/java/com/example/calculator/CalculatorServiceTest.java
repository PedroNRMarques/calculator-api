package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(new BigDecimal("5"), service.add(new BigDecimal("2"), new BigDecimal("3")));
    }

    @Test
    void testSubtract() {
        assertEquals(new BigDecimal("-1"), service.subtract(new BigDecimal("2"), new BigDecimal("3")));
    }

    @Test
    void testMultiply() {
        assertEquals(new BigDecimal("6"), service.multiply(new BigDecimal("2"), new BigDecimal("3")));
    }

    @Test
    void testDivide() {
        assertEquals(new BigDecimal("2"), service.divide(new BigDecimal("6"), new BigDecimal("3")));
    }
}
