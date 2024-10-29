package javacore.Bintroducaometodos.domain;

public class Calculadora {
    // métodos = modificador de acesso: (public) + retorno (void => retorna nada) + nome ( => convenção variáveis)
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 22);
    }

    // vamos adicionar parâmetros = variáveis locais dentro do método
    public void multiplicaDoisNumeros(float num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Não existe divisão por zero");
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }
}
