package org.howard.edu.lsp.oopfinal.question3;

public class Client {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape("Circle");
        if (circle != null) {
            circle.draw();
        }

        Shape rectangle = factory.createShape("Rectangle");
        if (rectangle != null) {
            rectangle.draw();
        }
    }
}
