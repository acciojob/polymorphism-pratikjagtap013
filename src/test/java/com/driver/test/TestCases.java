package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import com.driver.Main.Product;

public class TestCases {
    private Product p = new Product();

    @Test
    public final void testprintHelloWorld() {
        assertEquals(35, p.product(5, 7));
    }

    @Test
    public final void testprintHelloWorld2() {
        assertEquals(40.32, p.product(5.6, 7.2), 0.0);
    }

    @Test
    public final void testprintHelloWorld3() {
        assertEquals(480, p.product(6, 8, 10));
    }
}



