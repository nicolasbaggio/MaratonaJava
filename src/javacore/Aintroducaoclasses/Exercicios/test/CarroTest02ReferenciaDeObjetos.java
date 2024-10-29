package javacore.Aintroducaoclasses.Exercicios.test;

import javacore.Aintroducaoclasses.Exercicios.domain.Carro;

public class CarroTest02ReferenciaDeObjetos {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Corolla Cross";
        carro1.ano = 2025;
        carro1.modelo = "XRX Hybrid";

        carro2.nome = "Mitsubishi";
        carro2.ano = 2024;
        carro2.modelo = "Eclipse Cross";

        carro1 = carro2;

        System.out.println("Carro1: " + carro1.nome + ", Ano: " + carro1.ano + ", Modelo: " + carro1.modelo);
        System.out.println("Carro2: " + carro2.nome + ", Ano: " + carro2.ano + ", Modelo: " + carro2.modelo);
    }
}
