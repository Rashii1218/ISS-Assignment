package Oops;


class Shape {

    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {

    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Polymorphism{

    public static void main(String[] args) {

        Shape s1 = new Circle();
        s1.draw();   // Circle version

        Shape s2 = new Rectangle();
        s2.draw();   // Rectangle version
    }
}