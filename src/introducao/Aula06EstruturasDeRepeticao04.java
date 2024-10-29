package introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 90000;
        double valorParcela = 1000;
        for (int i = 1; i <= valorCarro / i; i++) {
            if (valorCarro / i < valorParcela) {
                break;
            }
            System.out.println("Pode ser feito em " + i + " parcelas de " + valorCarro / i);
        }
    }
}
