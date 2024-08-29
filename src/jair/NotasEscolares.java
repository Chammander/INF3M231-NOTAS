package jair;

import java.util.Scanner;

public class NotasEscolares {
    /*
     * notas dos 4 bimestres, média 7 pra passar
     */

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        // vetor do tipo float com 5 posições
        float notas[] = new float[5];
        String aluno, resultado;

        System.out.println("+-- Notas Escolares --+");
        System.out.print("Informe o nome do aluno: ");
        aluno = ler.nextLine();
        aluno = aluno.toUpperCase();

        for (int i = 0; i < 4; i++) {
            System.out.print("Informe a " + (i + 1) + "ª nota: ");
            notas[i] = ler.nextFloat();
            notas[4] += notas[i];
        }

        notas[4] = notas[4] / 4; // media

        if (notas[4] >= 7) {
            resultado = "APROVADO!";
        } else {
            resultado = "REPROVADO!";
        }

        System.out.println("O(A) aluno(a) " + aluno + " teve a média: " + notas[4] + " e foi " + resultado);
    }
}
