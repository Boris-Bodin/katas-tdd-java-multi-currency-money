package org.example;

import org.example.money.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiCurrencyAppTest {

    @Test
    public void testMultipication() {
        Dollar dollar = new Dollar(5);
        Dollar product = dollar.times(2);
        assertEquals(10, product.amount);
        product = dollar.times(3);
        assertEquals(15, product.amount);
    }
}
