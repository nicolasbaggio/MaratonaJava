package introducao;

public class Aula05EstruturasCondicionais03OperadorTernario {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 reais.";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        // OPERADOR TERNÁRIO
        // (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
