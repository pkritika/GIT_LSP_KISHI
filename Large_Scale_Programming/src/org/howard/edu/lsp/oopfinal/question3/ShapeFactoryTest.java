package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShapeFactoryTest {
    private ShapeFactory factory;

    @BeforeEach
    public void setUp() {
        factory = new ShapeFactory();
    }

    @Test
    public void testCreateCircle() {
        Shape circle = factory.createShape("Circle");
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        Shape rectangle = factory.createShape("Rectangle");
        assertTrue(rectangle instanceof Rectangle);
    }

    @Test
    public void testCreateInvalidShape() {
        Shape shape = factory.createShape("Pentagon");
        assertNull(shape);
    }
}

