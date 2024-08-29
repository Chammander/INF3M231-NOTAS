package atividades;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
    
    Scanner leituranumeros = new Scanner(System.in);
    int numeros = 0;
    int soma=0;

    while (numeros>=0) {
        System.out.print("Insira números para a soma: ");
        numeros = leituranumeros.nextInt();
            if (numeros >=0){
                soma = soma + numeros;
            }
    };
    System.out.println("\nA soma dos números positivos é: "+soma);
    leituranumeros.close();
}
}
