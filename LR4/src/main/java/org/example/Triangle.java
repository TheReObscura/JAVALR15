package org.example;

public class Triangle {
    double sideA, sideB, sideC;

    public Triangle(double A, double B, double C) {
        if (A < 0 || B < 0 || C < 0) throw new IllegalArgumentException("Нельзя ввести отрицательные длины.");
        if (!isValid()) throw new IllegalArgumentException("Такой треугольник не существует");
        sideC = C;
        sideB = B;
        sideA = A;
        System.out.println(perimeter());
    }

    private boolean isValid() {
        if (sideA + sideB == sideC || sideA + sideC == sideB || sideC + sideB == sideA) {
            return false;
        }
        return true;
    }

    private double perimeter() {
        return sideA + sideB + sideC;
    }

    public void print() {
        System.out.println("Треугольник со сторонами: " + sideA + ", " + sideB + ", " + sideC + ", и периметр" + perimeter());
    }
}
