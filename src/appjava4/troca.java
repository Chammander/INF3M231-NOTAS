package appjava4;

import java.util.Scanner;

public class troca {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a código da fruta: ");
        int fruta = entrada.nextInt();

        switch (fruta) {
            case 10:
                System.out.println("Laranja");
                break;
            case 20:
                System.out.println("Maçã");
                break;
            case 30:
                System.out.println("Banana");
                break;
            case 40:
                System.out.println("Uva");
                break;
            case 50:
                System.out.println("Ameixa");
                break;
            default:
                System.out.println("Erro! Tente novamente!");
                break;
        }
        entrada.close();
    }
}