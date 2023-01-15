package org.example;

public class Retangulo implements Forma {

    public double altura;
    public double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura= largura;
    }

    public double getArea() {
        double area = altura * largura;
        return area;
    }
    public double getPerimetro(double altura, double comprimento) {
        double perimetro = altura + altura + comprimento;
        return perimetro;
    }



}
