package com.hy.Extends;

/**
 * Created by sumimasah on 2017/9/7.
 */
public class Test_2 {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape.name);
        shape.printType();
        shape.printName();
        shape.b();

        System.out.println("--------------------------");

        Circle circle = new Circle();
        System.out.println(circle.name);
        circle.printType();
        circle.printName();
        circle.b();
    }
}

class Shape {
    public String name = "shape";

    public Shape() {
        System.out.println("shape constructor");
    }

    public void printType() {
        System.out.println("this is shape");
    }

    public static void printName() {
        System.out.println("shape");
    }

    public void b(){
        System.out.println("b");
    }
}

class Circle extends Shape {
    public String name = "circle";

    public Circle() {
        System.out.println("circle constructor");
    }

    public void printType() {
        System.out.println("this is circle");
    }

    public static void printName() {
        System.out.println("circle");
    }

    public static void a(){
        System.out.println("a");
    }
}