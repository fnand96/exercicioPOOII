package org.example;

public class Circulo implements Forma{
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getArea(){
        double area = 3.14 * raio*raio;
        return area;
    }

    public double getCircunferencia(double raio){
        double circunferencia = 2 * 3.14 * raio;
        return circunferencia;
    }
}
