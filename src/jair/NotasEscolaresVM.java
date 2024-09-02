package jair;

import java.util.Scanner;

/*
 * 5 notas 4 bimestres
 * e frequencia
 */
public class NotasEscolaresVM {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String alunos[][] = new String[5][2];
        float notas[][] = new float[5][6];

        System.out.println("+-- Notas Escolares --+");
        for (int i = 0; i < 5; i++) {
            System.out.print("Insira o nome do " + (i + 1) + "º aluno: ");
            alunos[i][0] = ler.next();
            for (int j = 0; j < 4; j++) {
                System.out.print("Insira a " + (j + 1) + "ª nota do aluno: ");
                notas[i][j] = ler.nextFloat();
                notas[i][5] += notas[i][j];// media
            } // for notas
            notas[i][5] = notas[i][5] / 4;// MEDIA
            System.out.print("Digite a frequência do " + alunos[i][0] + ": ");
            notas[i][4] = ler.nextFloat();
            if (notas[i][4] < 75) {
                alunos[i][1] = "Reprovado por falta!";
            } else if (notas[i][5] < 7) {
                alunos[i][1] = "Reprovado por nota!";
            } else {
                alunos[i][1] = "Aprovado!";
            } // if
            System.out.println("+--------------+");
        } // for aluno

        System.out.println("+-- Resultados --+");

        for (int i = 0; i < 5; i++) {
            System.out.println("O aluno " + alunos[i][0] + " teve a média de " + notas[i][5] + " e a frequência de "
                    + notas[i][4] + " e foi " + alunos[i][1] + ".");
        }
        System.out.println("+-- Programa Encerrado --+");
        System.out.print("Alterado no navegador!");
        System.out.println("Teste de push!");
    }
}
