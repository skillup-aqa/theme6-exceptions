package ua.skillup.theme51.shapes;

import java.util.Objects;

public class Triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        double p = this.perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a && b == triangle.b && c == triangle.c
                || a == triangle.a && b == triangle.c && c == triangle.b
                || a == triangle.b && b == triangle.a && c == triangle.c
                || a == triangle.b && b == triangle.c && c == triangle.a
                || a == triangle.c && b == triangle.a && c == triangle.b
                || a == triangle.c && b == triangle.b && c == triangle.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a) + Objects.hash(b) + Objects.hash(c);
    }
}
