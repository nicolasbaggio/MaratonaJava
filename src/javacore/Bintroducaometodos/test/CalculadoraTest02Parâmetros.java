package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.domain.Calculadora;

// boas práticas: Um método recebe no máximo 2 parâmetros, para mais crie um novo método.
public class CalculadoraTest02Parâmetros {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(10, 20.5F);
    }
}
