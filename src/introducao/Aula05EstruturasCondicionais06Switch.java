package introducao;

public class Aula05EstruturasCondicionais06Switch {
    public static void main(String[] args) {
        // Imprima se é dia útil ou final de semana, considerando 1 como domingo
        int dia = 3;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
