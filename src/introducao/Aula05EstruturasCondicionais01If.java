package introducao;

public class Aula05EstruturasCondicionais01If {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // ! (NEGAÇÃO)

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else
            System.out.println("Não autorizado a comprar bebida alcoólica");
    }
}
