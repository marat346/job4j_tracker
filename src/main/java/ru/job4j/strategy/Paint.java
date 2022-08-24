package ru.job4j.strategy;

public class Paint {

    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }

    public static void main(String[] args) {
            Paint context = new Paint();
            Triangle triangle = new Triangle();
            Square square = new Square();
            context.draw(triangle);
            context.draw(square);
        }
    }
