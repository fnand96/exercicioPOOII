package org.example;

public class Triangulo implements Forma {

    public double altura;
    public double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }


    public double getArea() {
        double area = (base * altura) / 2;
        return area;
    }

    public double getLado(double base, double altura) {
        double lado = altura * altura + altura * altura + base * base;
        return lado;
    }
}