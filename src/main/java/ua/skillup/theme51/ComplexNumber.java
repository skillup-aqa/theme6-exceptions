package ua.skillup.theme51;

import java.util.Objects;

public class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(3, 4);

        ComplexNumber c = a.add(b);
        System.out.println(a + " + " + b + " = " + c.toString());

        c = a.subtract(b);
        System.out.println(a + " - " + b + " = " + c.toString());

        c = a.multiply(b);
        System.out.println(a + " * " + b + " = " + c.toString());

        c = a.multiply(2);
        System.out.println(a + " * 2 = " + c.toString());

        c = a.divide(b);
        System.out.println(a + " / " + b + " = " + c.toString());

        c = a.divide(2);
        System.out.println(a + " / 2 = " + c.toString());

        c = a.conjugate();
        System.out.println("The conjugate of " + a + " is " + c.toString());

        double abs = a.abs();
        System.out.println("The absolute value of " + a + " is " + abs);
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public double abs() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(real - other.real, imaginary - other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(real * other.real - imaginary * other.imaginary,
                real * other.imaginary + imaginary * other.real);
    }

    public ComplexNumber multiply(double factor) {
        return new ComplexNumber(real * factor, imaginary * factor);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        return new ComplexNumber((real * other.real + imaginary * other.imaginary) / denominator,
                (imaginary * other.real - real * other.imaginary) / denominator);
    }

    public ComplexNumber divide(double divisor) {
        return new ComplexNumber(real / divisor, imaginary / divisor);
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(real, -imaginary);
    }

    @Override
    public String toString() {
        return real + "+" + imaginary + "i";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber complexNumber = (ComplexNumber) o;
        return real == complexNumber.real && imaginary == complexNumber.imaginary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }
}
