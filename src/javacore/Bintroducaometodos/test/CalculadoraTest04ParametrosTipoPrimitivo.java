package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest04ParametrosTipoPrimitivo {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
