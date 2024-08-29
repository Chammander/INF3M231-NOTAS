package atividades;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner leituranumeros = new Scanner(System.in);
        int maior = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um número: ");
            int valor = leituranumeros.nextInt();
                if (valor > maior) {
                    maior = valor;
                }
        }
        System.out.println("\nO maior número é "+maior);
        leituranumeros.close();
    }
}
