package introducao;

public class Aula05ExercicioTaxPerBracket {
    public static void main(String[] args) {
        // Tax rates in Netherlands 2020
        double salarioAnual = 30500;
        double resultado = 0;
        String imposto = "";
        if (salarioAnual <= 34712) {
            resultado = salarioAnual * 0.097;
            imposto = "9.70%";
        } else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            resultado = salarioAnual * 0.3735;
            imposto = "37.35%";
        } else {
            resultado = salarioAnual * 0.4950;
            imposto = "49.50%";
        }
        System.out.println("The tax per bracket is " + imposto + " = " + resultado);
    }
}
