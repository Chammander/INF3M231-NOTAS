package atividades;

import java.util.Scanner;

public class switchnotas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota = 0;
        String conceito = "";

        System.out.print("Informe a nota: ");
        nota = entrada.nextInt();

        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "C";
                break;
            case 4: case 3:
                conceito = "D";
                break;
            case 2: case 1: case 0:
                conceito = "E";
                break;

            default:
                conceito = "Nota inválida!";
        }
        System.out.println(conceito);
    }
}
