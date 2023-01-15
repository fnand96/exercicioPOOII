package org.example;


import java.util.List;

public class App {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(10,15);
        Circulo circulo = new Circulo(10);
        Retangulo retangulo = new Retangulo(15,10);

        List<Forma> formas = List.of(triangulo, circulo, retangulo);

        CalculadorDeArea calculadorDeArea = new CalculadorDeArea();
        calculadorDeArea.calcularArea(formas);
    }
}