package atividades;

import java.util.Scanner;

public class anobi {
public static void main(String[] args) {
    
    Scanner leituraano = new Scanner(System.in);
    int ano=0;

    System.out.print("Informe o ano: ");
    ano = leituraano.nextInt();
    if (ano % 4 == 0 && ano % 100 != 0) {
        System.out.println(ano+" é um ano bissexto!");
    }else {
        System.out.println(ano+" não é um ano bissexto!");
    }
}
}
