package org.example;

import java.util.List;

public class CalculadorDeArea {

    public void calcularArea(List<Forma> formas) {
        formas.get(0);
        Triangulo triangulo = new Triangulo(10,15);
        Circulo circulo = new Circulo(10);
        Retangulo retangulo = new Retangulo(15,10);

        System.out.println("----Calculador de Area----'");

        System.out.println("--Área do Triângulo: " + triangulo.getArea());
        System.out.println("--Lado do Triângulo: " + triangulo.getArea());

        System.out.println("-------------------------" );

        System.out.println("--Área do Círculo: " +  circulo.getArea());
        System.out.println("--Circunferência do Círculo: " + circulo.getCircunferencia(10));

        System.out.println("-------------------------" );

        System.out.println("--Área do Retângulo: " +  retangulo.getArea());
        System.out.println("--Perímetro do Retângulo: " + retangulo.getPerimetro(15,10));

        for (int i = 0; i < formas.size(); i++) {
            if(formas.get(i) == triangulo){
                triangulo.getArea();
                triangulo.getLado(10,15);

            } else if(formas.get(i) == circulo) {
                circulo.getArea();
                circulo.getCircunferencia(10);
            } else if(formas.get(i) == retangulo) {
                retangulo.getArea();
                retangulo.getPerimetro(15,10);
            }
        }
    }

}

