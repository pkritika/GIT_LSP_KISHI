package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class ShapeFactoryTest {
 

    @Test
    public void testCreateCircle() {
        Shape circle = ShapeFactory.createShape("Circle");
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        Shape rectangle = ShapeFactory.createShape("Rectangle");
        assertTrue(rectangle instanceof Rectangle);
    }

    @Test
    public void testCreateInvalidShape() {
        Shape shape = ShapeFactory.createShape("Pentagon");
        assertNull(shape);
    }
}

