package jair;

import java.util.Scanner;

public class CalcIMC {

    public static void main(String[] args) {

        String resultado = null;
        float altura, peso, imc;
        Scanner ler = new Scanner(System.in);

        System.out.println("+--Calculadora de IMC--+");
        System.out.print("Informe a sua altura: ");
        altura = ler.nextFloat();

        System.out.print("Informa o seu peso: ");
        peso = ler.nextFloat();

        imc = calcIMC(altura, peso);
        // imc= (float) (peso/Math.pow(altura,2));

        if (imc < 16) {
            resultado = "Magreza grave";
        } else if (imc < 16.9) {
            resultado = "Magreza moderada";
        } else if (imc < 18.5) {
            resultado = "Magreza leve";
        } else if (imc < 24.9) {
            resultado = "Peso ideal";
        } else if (imc < 29.9) {
            resultado = "Sobrepeso";
        } else if (imc < 34.9) {
            resultado = "Obesidade grau 1";
        } else if (imc < 39.9) {
            resultado = "Obesidade grau 2";
        } else {
            resultado = "Obesidade grau 3";
        }

        System.out.println("Seu IMC ideal com base nos dados é de: " + imc + " e seu resultado é: " + resultado);
    }// main
/**
 *Função calcIMC calcula o IMC de um individuo.
 *Recebe os seguintes parâmetros:
 * @param altura
 * @param peso
 * @return
 */
    public static float calcIMC (float altura, float peso){
        return peso / (altura * altura);
    }

}// classe
