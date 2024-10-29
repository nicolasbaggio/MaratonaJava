package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03Retorno {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(10, 0);
        System.out.println(result);
        System.out.println("-----");
        calculadora.imprimeDivisaoDeDoisNumeros(86,0);
    }
}
