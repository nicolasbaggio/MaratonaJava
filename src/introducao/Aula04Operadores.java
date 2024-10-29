package introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // OPERADORES ARITMÉTICOS + - / * %
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero02 - numero01);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // OPERADORES RELACIONAIS > < <= >= == !=
        boolean isTenBiggerThanTwenty = 10 > 20;
        System.out.println("is Ten Bigger Than Twenty? " + isTenBiggerThanTwenty);

        // OPERADORES LÓGICOS && (AND) || (OR) ! (NOT)
        int age = 29;
        float salary = 3500F;
        boolean isInsideLawBigger = age >= 30 && salary > 4612;
        boolean isInsideLawLesser = age < 30 && salary >= 3381;
        System.out.println("isInsideLawBigger " + isInsideLawBigger);
        System.out.println("isInsideLawLesser " + isInsideLawLesser);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystation5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystation5Compravel " + isPlaystation5Compravel);

        // OPERADORES DE ATRIBUIÇÃO = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // bonus = bonus + 1000
        System.out.println("bonus " + bonus);
    }
}
