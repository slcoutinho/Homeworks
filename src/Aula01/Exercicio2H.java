package Aula01;

import java.util.Scanner;

public class Exercicio2H{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float raio, altura, volume;
        float pi = 3.14f;

        System.out.println("Digite o valor do raio");
        raio = teclado.nextFloat();
        System.out.println("Digite o valor da altura");
        altura = teclado.nextFloat();

        volume = pi * raio * raio * altura;

        //System.out.println("Valor do volume = "+volume);

        System.out.printf("O valor do volume = %.2f\n", volume);
        teclado.close();
    }
}